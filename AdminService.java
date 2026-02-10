import java.util.*;

public class AdminService {

    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    private CandidateService candidateService = new CandidateService();
    private VoterService voterService = new VoterService();

    public boolean login(String user, String pass) {
        return USERNAME.equals(user) && PASSWORD.equals(pass);
    }

    public void addCandidate() {
        System.out.print("Enter Candidate ID: ");
        int id = InputUtil.readInt();

        if (candidateService.candidateExists(id)) {
            System.out.println("Candidate ID already exists");
            return;
        }

        System.out.print("Enter Candidate Name: ");
        String name = InputUtil.readString();

        List<Candidate> candidates = candidateService.loadCandidates();
        candidates.add(new Candidate(id, name, 0));
        candidateService.saveCandidates(candidates);

        System.out.println("Candidate added successfully");
    }

    public void addVoter() {
        System.out.print("Enter Voter ID: ");
        int id = InputUtil.readInt();

        if (voterService.voterExists(id)) {
            System.out.println("Voter ID already exists");
            return;
        }

        System.out.print("Enter Voter Name: ");
        String name = InputUtil.readString();

        voterService.addVoter(new Voter(id, name, false));
        System.out.println("Voter added successfully");
    }

    public void viewResults() {
        List<Candidate> candidates = candidateService.loadCandidates();

        int max = -1;
        List<Candidate> winners = new ArrayList<>();

        System.out.println("\n--- Voting Results ---");
        for (Candidate c : candidates) {
            System.out.println(c.getName() + " - " + c.getVoteCount() + " votes");

            if (c.getVoteCount() > max) {
                max = c.getVoteCount();
                winners.clear();
                winners.add(c);
            } else if (c.getVoteCount() == max) {
                winners.add(c);
            }
        }

        if (winners.size() == 1) {
            System.out.println("Winner: " + winners.get(0).getName());
        } else {
            System.out.print("Tie between: ");
            for (Candidate c : winners) {
                System.out.print(c.getName() + " ");
            }
            System.out.println();
        }
    }
}
