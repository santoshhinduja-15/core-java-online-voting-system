public class Voter {
    private int voterId;
    private String name;
    private boolean hasVoted;

    public Voter(int voterId, String name, boolean hasVoted) {
        this.voterId = voterId;
        this.name = name;
        this.hasVoted = hasVoted;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public boolean hasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }

    @Override
    public String toString() {
        return voterId + "," + name + "," + hasVoted;
    }
}