package analyze;

public enum AllCandidates {
	LARRY_ELDER("Larry Elder",3,0),
	KEVIN_PAFFRATH("Kevin Paffrath",4,0),
	JOHN_COX("John Cox",5,0),
	KEVIN_FAULCONER("Kevin Faulconer",6,0),
	NONE("None",7,0);
	
	private final String candidateName;
	private final int candidateNum;
	private int voteCount;
	
	AllCandidates(String candidateName, int candidateNum, int voteCount) {
		this.candidateName = candidateName;
		this.candidateNum = candidateNum;
		this.voteCount = voteCount;
	}
	
	public String getCandidateName() {
		return candidateName;
	}
	
	public int getCandidateNum() {
		return candidateNum;
	}
	
	public int getVoteCount() {
		return voteCount;
	}
	
	public void addVoteCount() {
		voteCount += 1;
		//System.out.print(candidateName + ". Successfully Added!");
	}
}
