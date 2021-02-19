// Lab 1 eg1 : Greetings.java       --- comment

import java.util.Scanner;

public class Greetings {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        final int YEAR = 2020;              // final: To declare constant   --- literal value

        System.out.print("Please enter your name    : ");
        String name = input.nextLine();     // prompt user to enter name.

        System.out.print("Please enter your age     : ");
        int age = input.nextInt();          // prompt user to enter age.

        int year = YEAR - age;              // calculate the year user was born

        System.out.print("Your CGPA? : ");
        double cgpa = input.nextDouble();   // prompt user to enter CGPA

        System.out.println("\nHello "+name);
        System.out.println("You were born in "+year);
        System.out.println("CGPA : "+cgpa);
        System.out.printf("CGPA : %.3f\n",cgpa);        //Using method printf, display result in 3 decimal places
    }
}
