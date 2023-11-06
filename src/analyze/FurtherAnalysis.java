package analyze;

public class FurtherAnalysis {

	/*
	 * recall vote and in favor vote diff
	 * difference between the highest vote and the rest
	 * EXPAND ON LAST IDEA if more lines needed
	 * */
	int recallCount;
	int inFavorCount;
	
	public FurtherAnalysis(int recallCount, int inFavorCount) {
		this.recallCount = recallCount;
		this.inFavorCount = inFavorCount;
	}
	
	public void diff() {
		if(recallCount > inFavorCount) {
			int diff = recallCount - inFavorCount;
			System.out.println("The difference between the number of recall votes and the number of in favor votes is: "+ diff + ".");
		}else if(inFavorCount > recallCount) {
			int diff = inFavorCount - recallCount;
			System.out.println("The difference between the number of recall votes and the number of in favor votes is: "+ diff + ".");
		}else {
			System.out.println("The difference between the number of recall votes and the number of in favor votes is: 0.");
		}
	}
	
	public void candDiff() {
		//Results result = new Results(recallCount,inFavorCount);
		int[] candTotals = Results.getCandVotetotals();
		int highest = candTotals[0];
		int highestIndex = 0;
		
		for(int i = 0; i<4; i++) {
			if(candTotals[i] > highest) {
				highest = candTotals[i];
				highestIndex = i;
			}
			if(i == 3) {
				String[] allCandNames = Results.getCandNames();
				for(int j = 0; j<4; j++) {
					if(j != highestIndex) {
						int diff = candTotals[highestIndex] - candTotals[j];
						System.out.println(allCandNames[j] + " had " + diff + " less votes than " + allCandNames[highestIndex]+ ".");
					}
				}
			}
		}
	}
}