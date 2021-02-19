// String.format --- similar to printf, for formatting the decimal

import java.util.Scanner;
import java.lang.Math;      // perform basic numeric operations

public class Chapter2_Ex1 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        double pricePerSqInch, diameter, price;
        final double PI = 3.142;

        System.out.print("Enter the diameter of the pizza (inch) : ");
        diameter = get.nextDouble();
        System.out.print("Enter the price of the pizza : RM ");
        price = get.nextDouble();

        double radius = diameter/2;
        double area = PI*(Math.pow(radius,2));      // Math.pow()
        // double area = PI*radius*radius;

        pricePerSqInch = price/area;

        System.out.println("\nSize of the pizza is " + String.format("%.2f",area) + " inches.\n" +
                "Price per square inch is RM " + String.format("%.2f" , pricePerSqInch) + ".");
        // second method to display
        System.out.printf("\nSize of the pizza is %.2f inches." +
                "\nPrice per square inch is RM %.2f.\n", area, pricePerSqInch);
    }
}
