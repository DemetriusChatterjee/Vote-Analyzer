package analyze;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Drive {
	
	final int votedFor = 1;
	
	public static void main(String[] args) throws FileNotFoundException{
		
		File file = new File("nums.txt");
		Scanner scan = new Scanner(file);
		
		AllCandidates larryElder = AllCandidates.LARRY_ELDER;
		AllCandidates kevinPaffrath = AllCandidates.KEVIN_PAFFRATH;
		AllCandidates johnCox = AllCandidates.JOHN_COX;
		AllCandidates kevinFaulconer = AllCandidates.KEVIN_FAULCONER;
		AllCandidates none = AllCandidates.NONE;
		
		ArrayList<Integer> allVoterIDs = new ArrayList<>();
		
		while(scan.hasNextLine()) {
	
			String line = scan.nextLine();
			String[] split = line.split(", ");
			int recallIndicator = Integer.valueOf(split[0]);
			int candidateVote = Integer.valueOf(split[1]);
			int voterID = Integer.valueOf(split[2]);
			
			
			boolean alreadyVoted;
			if(allVoterIDs.contains(voterID)) { 
				alreadyVoted = true;
			}else {
				alreadyVoted = false;
			}
			
			if(allVoterIDs.contains(voterID)) { 
				alreadyVoted = true;
			}else {
				alreadyVoted = false;
			}
		
			
			
			RecallVote r = new RecallVote(recallIndicator);
			String recallStatus = r.getRecallStatus();
			r.addStatus();
			
			if(alreadyVoted == false) {
				allVoterIDs.add(voterID);
				System.out.print("\nVoter #" + voterID + " voted " + recallStatus + " on recalling Gavin Newson and voted for ");
				if(candidateVote == larryElder.getCandidateNum()) {
					larryElder.addVoteCount();
					System.out.print(larryElder.getCandidateName() + ".");
				}else if(candidateVote == kevinPaffrath.getCandidateNum()) {
					kevinPaffrath.addVoteCount();
					System.out.print(kevinPaffrath.getCandidateName() + ".");
				}else if(candidateVote == johnCox.getCandidateNum()){
					johnCox.addVoteCount();
					System.out.print(johnCox.getCandidateName() + ".");
				}else if(candidateVote == kevinFaulconer.getCandidateNum()) {
					kevinFaulconer.addVoteCount();
					System.out.print(kevinFaulconer.getCandidateName() + ".");
				}else{
					none.addVoteCount();
					System.out.print(none.getCandidateName() + ".");
				}
			}else {
				System.out.print("\nVoter #" + voterID + " has already voted!");
			}
			
			if(!(scan.hasNextLine())) {
				System.out.println();
				System.out.println();
				Results results = new Results(r.getRecallCount(), r.getInFavorVoteTotal());
				results.gavinResultsOutput();
				results.candidateFinalResults();
				
				System.out.println("\n\nSome further analysis...");
				FurtherAnalysis fA = new FurtherAnalysis(r.getRecallCount(), r.getInFavorVoteTotal());
				fA.diff();
				fA.candDiff();
			}
		}
		scan.close();
	}
}