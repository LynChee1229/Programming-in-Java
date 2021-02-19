// CHAN LIN CHEE 1191202546
// TT6V
// Lab 4 - Question 1

import java.util.Scanner;

public class Lab4Q1 {
    public static void main(String [] args){

        // prompt user to enter starting balance
        System.out.print("What is your account's starting balance? \n(RM) ");
        double startBalance = new Scanner(System.in).nextDouble();

        // create an object with parameter 'startBalance'
        BankAccount object = new BankAccount(startBalance);

        // prompt user to enter deposit amount
        System.out.print("\nHow much pay that has been deposited this month? \n(RM) ");
        double depositAmt = new Scanner(System.in).nextDouble();

        // set deposit amount to account
        object.deposit(depositAmt);

        // display current balance
        System.out.printf("Your current balance is RM %.2f\n",object.getBalance());

        // prompt user to enter withdraw amount
        System.out.print("\nHow much would you like to withdraw? \n(RM) ");
        double withdrawAmt = new Scanner(System.in).nextDouble();

        // set withdraw amount to account
        object.withdraw(withdrawAmt);

        // display current balance
        System.out.printf("Now your balance is RM %.2f\n",object.getBalance());
    }
}
