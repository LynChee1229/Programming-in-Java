// Lab 3A eg2 : CalculateAreaV2.java

import java.util.Scanner;

public class CalculateAreaV2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        double area=0;

        System.out.println("\n              MENU ");
        System.out.println("-----------------------------------");
        System.out.println("1. Calculate Area of Rectangle");
        System.out.println("2. Calculate Area of Circle");
        System.out.println("3. Exit Program");
        System.out.println("-----------------------------------");

        System.out.print("Please enter your choice : ");
        int choice = input.nextInt();

        while(choice!=3){
            switch(choice){
                case 1 :    System.out.print("Enter width  : ");
                            double width = input.nextDouble();
                            System.out.print("Enter length : ");
                            double length = input.nextDouble();
                            area = getAreaRectangle(width,length);      // calling method
                            break;

                case 2 :    System.out.print("Enter radius  : ");
                            double radius = input.nextDouble();
                            area = getAreaCircle(radius);               // calling method
                            break;

                default :   System.out.println("Invalid input.");
                            area = 0;
                            break;
            } // switch
            System.out.printf("The area is : %.2f\n",area);

            System.out.print("\nPlease enter your choice : ");
            choice = input.nextInt();
        } // end while
        System.out.println("\nProgram end.");
    } // main

    // method definition for two methods
    public static double getAreaRectangle (double w,double len){
        return (w*len);
    }
    public static double getAreaCircle (double r){
        final double PI = 3.142;
        return(PI*r*r);
    }
} // class
