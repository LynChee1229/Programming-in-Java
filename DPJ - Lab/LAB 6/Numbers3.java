//Lab 6 eg 3: Numbers3.java
// MULTIPLE EXCEPTION HANDLING

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numbers3
{
    public static void main (String [] arg)
    {
        boolean contLoop = true;
        do{
            try
            {
                System.out.print("\nType a number: ");
                double n = new Scanner(System.in).nextDouble();

                // pause to check if there is error, error will be thrown, and catch block will catch it to process
                if(n>0)
                    System.out.println(n +" is a positive number");
                else if(n<0)
                    System.out.println(n +" is a negative number");
                else
                    System.out.println(n +" is a zero number");

                System.out.print("\nEnter an integer numerator: ");
                int x = new Scanner(System.in).nextInt();

                System.out.print("Enter an integer denominator: ");
                int y = new Scanner(System.in).nextInt();

                int result = x / y;

                // pause to check if there is error, error will be thrown, and catch block will catch it to process

                System.out.printf("Result: %d / %d = %d\n", x,y,result);

                System.out.print("\nType your name: ");
                String name = new Scanner(System.in).nextLine();

                System.out.println("Hello "+ name);
                contLoop = false;
            }

            catch(InputMismatchException e)
            {
                System.out.println("Exception type: " + e);
                System.out.println("Wrong input.You must enter a number.Please try again.");
            }

            catch(ArithmeticException e)
            {
                System.out.println("Exception type: " + e);
                System.out.println("Cannot divide by zero.Please try again.");
            }
        } while(contLoop);
    }
}

/*
    4) a) InputMismatchException catch block
    4) b) Yes, after the exception has been thrown, it skipped the remaining code.

    5) b) ArithmeticException catch block
    5) c) No if there is an error thrown

    Conclusion3: multiple/many
 */