import java.awt.*;
import java.util.Scanner;

public class NumberWithException {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Enter number 1 : ");
            num1 = input.nextInt();

            System.out.print("Enter number 2 : ");
            num2 = input.nextInt();

            if(isEven(num1,num2) == true)
                System.out.println("Even number.");
            else
                System.out.println("Odd number."); }
        catch (NumberFormatException e) {
            System.out.println("Invalid format."); }
        catch (Exception e) {
            System.out.println("An error has occurred."); }
        finally {
            System.out.println("End of program."); }
    }

    public static boolean isEven(int num1, int num2) {
        try {
            int num3 = num2 / (num1 - 4);

            if(num3 % 2 == 0)
                return true;
            else
                return false; }
        catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception."); }
        catch (ArithmeticException e) {
            System.out.println("Division-by-zero exception"); }
        return false;
    }
}
