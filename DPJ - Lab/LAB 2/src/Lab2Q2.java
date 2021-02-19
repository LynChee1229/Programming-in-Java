// CHAN LIN CHEE 1191202546
// TT6V
// Lab 2 - Question 2

import java.util.Scanner;
import java.lang.Math;

public class Lab2Q2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a number of students = ");
        int num = get.nextInt();

        double total = 0;
        for(int i=0; i<num; i++){
            System.out.println("\nEnter weight and height for student " + (i+1) + " : ");
            System.out.print("Weight (lbs)  = ");
            double weight = get.nextDouble();
            System.out.print("Height (in)   = ");
            double height = get.nextDouble();
            double bmi = (weight * 703) / Math.pow(height,2);
            total = total + bmi;        // total += bmi;
        }

        double average = (double) total / num;
        System.out.printf("\nAverage BMI for this class is : %.2f",average);

        String category = " ";
        if(average<18.5)
            category = "Underweight";
        else if(average>=18.5 && average<25)
            category = "Normal";
        else if(average>=25 && average<30)
            category = "Overweight";
        else if(average>=30)
            category = "Obese";

        System.out.println("\nMajority the students of this class are : " + category);
    }
}
