import java.io.*;
import java.util.*;

public class FileUtil {

    private static void ensureFileExists(String fileName) {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("File creation failed: " + fileName);
        }
    }

    public static List<String> readFile(String fileName) {
        ensureFileExists(fileName);

        List<String> lines = new ArrayList<>();
        try (Scanner fs = new Scanner(new File(fileName))) {
            while (fs.hasNextLine()) {
                lines.add(fs.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return lines;
    }

    public static void writeFile(String fileName, List<String> data) {
        ensureFileExists(fileName);

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            for (String line : data) {
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("File write error");
        }
    }
}
