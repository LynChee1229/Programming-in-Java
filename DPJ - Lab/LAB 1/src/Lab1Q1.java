// CHAN LIN CHEE 1191202546
// TT6V
// Lab 1 - Question 1

import java.util.Scanner;

public class Lab1Q1 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        final double tax = 0.0675;
        final double discount = 0.10;

        System.out.print("Enter customer name       : ");
        String name = get.nextLine();
        System.out.print("Enter total meal charge   : RM ");
        double charge = get.nextDouble();

        double taxAmount = charge * tax;
        double discountAmount = charge * discount;
        double total = charge + taxAmount - discountAmount;

        System.out.println("\nBill Details");
        System.out.println("Customer Name      : " + name);
        System.out.printf("Total Meal Charge  : RM %.2f\n" , charge);
        System.out.printf("Tax Amount         : RM %.2f\n" , taxAmount);
        System.out.printf("Discount           : RM %.2f\n" , discountAmount);
        System.out.printf("Total Bill         : RM %.2f\n" , total);
    }
}
