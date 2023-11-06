package analyze;

public class Results {

	int recallVoteTotal;
	int inFavorVoteTotal;
	
	public Results(int recallVoteTotal, int inFavorVoteTotal) {
		this.recallVoteTotal = recallVoteTotal;
		this.inFavorVoteTotal = inFavorVoteTotal;
	}
	
	public void gavinResultsOutput() {
		System.out.print("Will Gavin Newson be recalled?");
		if(recallVoteTotal > inFavorVoteTotal) {
			System.out.print(" Yes. " + inFavorVoteTotal + " votes against recall, " + recallVoteTotal + " votes in favor.");
		}
		else {
			System.out.print("Yes. " + inFavorVoteTotal + " votes against recall, " + recallVoteTotal + " votes in favor.");
		}
	}
	
	public void candidateFinalResults() { 
		System.out.println("\nHow many votes for each candidate?");
		System.out.println("Votes for " + AllCandidates.LARRY_ELDER.getCandidateName() + ": " + AllCandidates.LARRY_ELDER.getVoteCount());
		System.out.println("Votes for " + AllCandidates.KEVIN_PAFFRATH.getCandidateName() + ": " + AllCandidates.KEVIN_PAFFRATH.getVoteCount());
		System.out.println("Votes for " + AllCandidates.JOHN_COX.getCandidateName() + ": " + AllCandidates.JOHN_COX.getVoteCount());
		System.out.println("Votes for " + AllCandidates.KEVIN_FAULCONER.getCandidateName() + ": " + AllCandidates.KEVIN_FAULCONER.getVoteCount());
		System.out.println("Votes for " + AllCandidates.NONE.getCandidateName() + ": " + AllCandidates.NONE.getVoteCount());
		System.out.println();
		System.out.print("Which replacement candidate won the most votes? ");
		
		int[] allVoteCounts = {AllCandidates.LARRY_ELDER.getVoteCount(), AllCandidates.KEVIN_PAFFRATH.getVoteCount(), AllCandidates.JOHN_COX.getVoteCount(), AllCandidates.KEVIN_FAULCONER.getVoteCount()};
		int highest = allVoteCounts[0];
		int highestIndex = 0;
		
		for(int i = 0; i<4; i++) {
			if(allVoteCounts[i] > highest) {
				highest = allVoteCounts[i];
				highestIndex = i;
			}
			
			if(i == 3) {
				switch(highestIndex) {
				case 0: System.out.print(AllCandidates.LARRY_ELDER.getCandidateName()); break;
				case 1: System.out.print(AllCandidates.KEVIN_PAFFRATH.getCandidateName()); break;
				case 2: System.out.print(AllCandidates.JOHN_COX.getCandidateName()); break;
				default: System.out.print(AllCandidates.KEVIN_FAULCONER.getCandidateName()); break;
				}
			}
			
		}
	}
	
	public static int[] getCandVotetotals() {
		int[] allVoteCounts = {AllCandidates.LARRY_ELDER.getVoteCount(), AllCandidates.KEVIN_PAFFRATH.getVoteCount(), AllCandidates.JOHN_COX.getVoteCount(), AllCandidates.KEVIN_FAULCONER.getVoteCount()};
		return allVoteCounts;
	}
	
	public  static String[] getCandNames() {
		String[] allCandNames = {AllCandidates.LARRY_ELDER.getCandidateName(),AllCandidates.KEVIN_PAFFRATH.getCandidateName(),AllCandidates.JOHN_COX.getCandidateName(),AllCandidates.KEVIN_FAULCONER.getCandidateName()};
		return allCandNames;
	}
}