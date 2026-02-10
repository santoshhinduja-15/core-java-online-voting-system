import java.util.*;

public class VotingStatusUtil {

    private static final String FILE = "voting_status.txt";

    public static void initialize() {
        List<String> lines = FileUtil.readFile(FILE);
        if (lines.isEmpty()) {
            FileUtil.writeFile(FILE, List.of("OPEN"));
        }
    }

    public static boolean isVotingOpen() {
        List<String> lines = FileUtil.readFile(FILE);
        return !lines.isEmpty() && lines.get(0).equalsIgnoreCase("OPEN");
    }

    public static void openVoting() {
        FileUtil.writeFile(FILE, List.of("OPEN"));
    }

    public static void closeVoting() {
        FileUtil.writeFile(FILE, List.of("CLOSED"));
    }
}
