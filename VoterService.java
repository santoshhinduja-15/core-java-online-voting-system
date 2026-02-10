import java.util.*;

public class VoterService {

    private final String fileName = "voters.txt";

    public List<Voter> loadVoters() {
        List<Voter> voters = new ArrayList<>();
        for (String line : FileUtil.readFile(fileName)) {
            if (line.trim().isEmpty()) continue;
            String[] d = line.split(",");
            voters.add(new Voter(
                    Integer.parseInt(d[0]),
                    d[1],
                    Boolean.parseBoolean(d[2])
            ));
        }
        return voters;
    }

    public boolean voterExists(int id) {
        for (Voter v : loadVoters()) {
            if (v.getVoterId() == id) return true;
        }
        return false;
    }

    public void addVoter(Voter voter) {
        List<Voter> voters = loadVoters();
        voters.add(voter);

        List<String> out = new ArrayList<>();
        for (Voter v : voters) out.add(v.toString());

        FileUtil.writeFile(fileName, out);
    }

    public Voter getVoterById(int id) {
        for (Voter v : loadVoters()) {
            if (v.getVoterId() == id) return v;
        }
        return null;
    }

    public void updateVoter(Voter updated) {
        List<String> out = new ArrayList<>();
        for (Voter v : loadVoters()) {
            out.add(v.getVoterId() == updated.getVoterId()
                    ? updated.toString()
                    : v.toString());
        }
        FileUtil.writeFile(fileName, out);
    }
}
