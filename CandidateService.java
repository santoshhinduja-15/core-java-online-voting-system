import java.util.*;

public class CandidateService {

    private final String fileName = "candidates.txt";

    public List<Candidate> loadCandidates() {
        List<Candidate> list = new ArrayList<>();

        for (String line : FileUtil.readFile(fileName)) {
            if (line.trim().isEmpty()) continue;

            String[] d = line.split(",");

            int id = Integer.parseInt(d[0].trim());
            String name = d[1].trim();
            int votes = Integer.parseInt(d[2].trim());

            list.add(new Candidate(id, name, votes));
        }
        return list;
    }

    public boolean candidateExists(int id) {
        for (Candidate c : loadCandidates()) {
            if (c.getCandidateId() == id) return true;
        }
        return false;
    }

    public void saveCandidates(List<Candidate> candidates) {
        List<String> out = new ArrayList<>();
        for (Candidate c : candidates) {
            out.add(c.toString());
        }
        FileUtil.writeFile(fileName, out);
    }

    public void showCandidates() {
        List<Candidate> candidates = loadCandidates();
        if (candidates.isEmpty()) {
            System.out.println("No candidates available");
            return;
        }

        for (Candidate c : candidates) {
            System.out.println(c.getCandidateId() + " - " + c.getName());
        }
    }
}
