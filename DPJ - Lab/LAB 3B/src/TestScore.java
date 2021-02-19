// Lab 3B eg1 : TestScore.java

import java.util.Scanner;

public class TestScore {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double[] score = new double[5];
        System.out.println("Enter the test score for 5 students.");
        for(int i=0; i<score.length; i++){
            System.out.print("\nStudent "+(i+1)+" : ");
            score[i] = input.nextDouble();

            if(score[i]<50)
                System.out.println("Result : Fail");
            else if(score[i]>=50 && score[i]<70)
                System.out.println("Result : Average");
            else
                System.out.println("Result : Good");
        }
    }

}
