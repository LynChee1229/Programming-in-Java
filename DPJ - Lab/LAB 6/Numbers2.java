//Lab 6 eg 2: Numbers2.java
// EXCEPTION HANDLING : InputMismatchException

import java.util.Scanner;
import java.util.InputMismatchException;

public class Numbers2
{
    public static void main (String [] arg)
    {
        boolean contLoop = true;
        do {
            try
            {
                System.out.print("\nType a number: ");
                double n = new Scanner(System.in).nextDouble();

                // pause to check if there is error
                // error will be thrown, and catch block will catch it to process
                if(n>0)
                        System.out.println(n +" is a positive number");
                else if(n<0)
                        System.out.println(n +" is a negative number");
                else
                        System.out.println(n +" is a zero number");

                System.out.print("\nType your name: ");
                String name = new Scanner(System.in).nextLine();

                System.out.println("Hello "+ name);
                contLoop = false;
            }

            catch(InputMismatchException e)
            {
            //    You may delete the // to see how the object of the exception (e) is displayed
            //    System.out.println("\nException type is: " + e);
                System.out.println("Wrong input. You must enter a number. Please try again.");
            }
        }while(contLoop);
    }
}

/*
    5) Yes, the program run well. (Because the program have handler to handling exception)

    6) No, it will pause, skip the code onwards and throw an exception for the first input.

    7) No. (Depends on line 34)

    8) The user input is a type of input mismatch exception, it has been thrown, so the catch block will catch it to process.

    Conclusion2: try; catch; match
*/