import java.util.Scanner;

public class InputUtil {
    public static final Scanner sc = new Scanner(System.in);

    public static int readInt() {
        while (!sc.hasNextInt()) {
            System.out.print("Enter valid number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    public static String readString() {
        return sc.next();
    }
}
