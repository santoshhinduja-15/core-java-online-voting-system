public class VotingSystem {
    private AdminService adminService = new AdminService();
    private VoteService voteService = new VoteService();
    private CandidateService candidateService = new CandidateService();

    public void start() {

        VotingStatusUtil.initialize();

        System.out.println("1. Admin Login");
        System.out.println("2. Voter Login");
        System.out.print("Choose option: ");
        int choice = InputUtil.readInt();

        if (choice == 1) {
            adminFlow();
        } else if (choice == 2) {
            voterFlow();
        } else {
            System.out.println("Invalid choice");
        }
    }

    private void adminFlow() {
        System.out.print("Enter Username: ");
        String user = InputUtil.readString();

        System.out.print("Enter Password: ");
        String pass = InputUtil.readString();

        if (!adminService.login(user, pass)) {
            System.out.println("Invalid admin credentials");
            return;
        }

        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Candidate");
            System.out.println("2. Add Voter");
            System.out.println("3. Open Voting");
            System.out.println("4. Close Voting");
            System.out.println("5. View Results");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int option = InputUtil.readInt();

            switch (option) {
                case 1 -> adminService.addCandidate();
                case 2 -> adminService.addVoter();
                case 3 -> {
                    VotingStatusUtil.openVoting();
                    System.out.println("Voting OPEN");
                }
                case 4 -> {
                    VotingStatusUtil.closeVoting();
                    System.out.println("Voting CLOSED");
                }
                case 5 -> adminService.viewResults();
                case 6 -> { return; }
                default -> System.out.println("Invalid option");
            }
        }
    }

    private void voterFlow() {
        System.out.print("Enter Voter ID: ");
        int voterId = InputUtil.readInt();

        candidateService.showCandidates();

        System.out.print("Enter Candidate ID: ");
        int candidateId = InputUtil.readInt();

        voteService.castVote(voterId, candidateId);
    }
}