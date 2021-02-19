// CHAN LIN CHEE 1191202546
// TT6V
// Lab 3B - Question 2

import java.util.Scanner;

public class Lab3bQ2 {
    static String [] candidate = {"Anna","Kristy","Robin"};
    static String [] club = {"Chess","Archery","Badminton","Music"};

    public static void main(String [] args){
        int[][] vote = new int[3][4];       // 3 candidates and 4 clubs
        int[] totalVote = new int[3];       // 3 candidates

        System.out.println("Enter the votes for the candidate : ");
        for(int j=0; j<vote.length; j++){                            // loop for candidate
            System.out.println("\nCandidate "+(j+1)+" : "+candidate[j]);
            for(int i=0; i<vote[j].length; i++){                    // loop for club
                System.out.print("From club "+club[i]+" = ");
                vote[j][i] = new Scanner(System.in).nextInt();
            }
        }
        getTotalVotes(vote,totalVote);      // vote array have been filled in by line 15-22 ; totalVote is empty
        getWinner(totalVote);   // passing totalVote array
    }

    public static void getTotalVotes(int[][] votes, int[] totalVotes){
        System.out.println("\nThe Result");
        for(int j=0; j<votes.length; j++){
            for(int i=0; i<votes[j].length; i++){
                totalVotes[j] += votes[j][i];       // totalVote originally is an empty array, no need set total=0
            }
            System.out.println("Candidate "+(j+1)+" : "+candidate[j]+", Total Votes = "+totalVotes[j]);
        }
    }

    public static void getWinner(int[] ttlVotes){
        int highest=ttlVotes[0], winnerIndex=0;     // assume Anna is the winner with highest totalVote
        for(int j=1; j<ttlVotes.length; j++){
            if(ttlVotes[j] > highest){
                highest = ttlVotes[j];
                winnerIndex = j;
            }
        }
        System.out.println("\nThe winner is "+candidate[winnerIndex]);
    }
}
