public class Candidate {
    private int candidateId;
    private String name;
    private int voteCount;

    public Candidate(int candidateId, String name, int voteCount) {
        this.candidateId = candidateId;
        this.name = name;
        this.voteCount = voteCount;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public String getName() {
        return name;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public void incrementVote() {
        voteCount++;
    }

    @Override
    public String toString() {
        return candidateId + "," + name + "," + voteCount;
    }
}
