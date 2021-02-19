// CHAN LIN CHEE 1191202546
// TT6V
// Lab 1 - Question 2

import java.util.Scanner;

public class Lab1Q2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        final double base = 2500;
        double comm=0, salary;

        System.out.print("Enter sales amount : RM ");
        double sales = get.nextDouble();

        if(sales<10000)
            comm = sales*0.05;
        else if(sales>=10000 && sales<15000)
            comm = sales*0.10;
        else if(sales>=15000 && sales<20000)
            comm = sales*0.12;
        else if(sales>=20000)
            comm = sales*0.15;

        salary = base + comm;
        System.out.println("Commission Amount  : RM " + String.format("%.2f",comm));
        System.out.printf("Monthly Salary     : RM %.2f\n",salary);
    }
}
