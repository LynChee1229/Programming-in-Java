// CHAN LIN CHEE 1191202546
// TT6V
// Lab 4 - Question 2

import java.util.Scanner;

public class Lab4Q2 {
    public static void main(String [] args){

        // prompt user to enter num of students
        System.out.print("How many students in the class? : ");
        int stud = new Scanner(System.in).nextInt();

        // create an array (double type), size is num of students
        double [] quizSc = new double[stud];

        // prompt user enter score for each student
        System.out.println("\nEnter the score of quiz for the class. ");
        for(int x=0; x<quizSc.length; x++) {
            System.out.print("Student "+(x+1)+" : ");
            quizSc[x] = new Scanner(System.in).nextDouble();
        }

        // create an object of QuizScores and pass the array
        QuizScores obj = new QuizScores(quizSc);

        // display all the data
        System.out.println("\nAverage score : "+obj.getAverage());
        System.out.println("Average grade : "+obj.getGrade());
        System.out.println("Maximum score : "+obj.getMaxScore());
    }
}
