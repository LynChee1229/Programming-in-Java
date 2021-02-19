// CHAN LIN CHEE 1191202546
// TT6V
// Lab 3A - Question 1

import java.util.Scanner;

public class Lab3aQ1 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter score for Quiz 1 : ");
        int num1 = get.nextInt();
        System.out.print("Enter score for Quiz 2 : ");
        int num2 = get.nextInt();
        System.out.print("Enter score for Quiz 3 : ");
        int num3 = get.nextInt();

        int total = getTotal(num1, num2, num3);
        double average = getAverage(total);
        printAll(total,average);
    }

    public static int getTotal(int a, int b, int c){
        return(a+b+c);
    }

    public static double getAverage(int total){
        return (double)total/3;
    }

    public static void printAll(int ttl, double avg){
        System.out.println("The total score of the quizzes is = "+ttl);
        System.out.printf("The average of score is = %.2f\n",avg);
    }
}
