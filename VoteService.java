import java.util.*;

public class VoteService {

    private VoterService voterService = new VoterService();
    private CandidateService candidateService = new CandidateService();

    public void castVote(int voterId, int candidateId) {

        // Check voting status
        if (!VotingStatusUtil.isVotingOpen()) {
            System.out.println("Voting is CLOSED");
            return;
        }

        // Check voter existence
        Voter voter = voterService.getVoterById(voterId);
        if (voter == null) {
            System.out.println("Invalid Voter ID");
            return;
        }

        // Check candidate existence FIRST
        List<Candidate> candidates = candidateService.loadCandidates();
        Candidate selectedCandidate = null;

        for (Candidate c : candidates) {
            if (c.getCandidateId() == candidateId) {
                selectedCandidate = c;
                break;
            }
        }

        if (selectedCandidate == null) {
            System.out.println("Invalid Candidate ID");
            return;
        }

        // Now check if voter already voted
        if (voter.hasVoted()) {
            System.out.println("You have already voted");
            return;
        }

        // Cast the vote
        selectedCandidate.incrementVote();
        voter.setHasVoted(true);

        candidateService.saveCandidates(candidates);
        voterService.updateVoter(voter);

        System.out.println("Vote cast successfully");
    }
}
