package analyze;

public class RecallVote {

	private String recallStatus;
	private int recallIndicator;
	private static int recallCount = 0;
	private static int inFavorVoteTotal = 0;
	
	public RecallVote(int recallIndicator) {
		this.recallIndicator = recallIndicator;
	}
	
	public String getRecallStatus() {
		if(recallIndicator == 1) {
			recallStatus = "yes";
		}else {
			recallStatus = "no";
		}
		return recallStatus;
	}
	
	public void addStatus() {
		if(recallStatus == "yes") {
			recallCount += 1;
		}else {
			inFavorVoteTotal += 1;
		}
	}
	
	public int getInFavorVoteTotal() {
		return inFavorVoteTotal;
	}
	
	public int getRecallCount() {
		return recallCount;
	}
	
	public int inFavorVoteTotal() {
		return inFavorVoteTotal;
	}
}