//Lab 6 eg 1: Numbers1.java
// WITHOUT EXCEPTION HANDLING

import java.util.Scanner;

public class Numbers1
{
    public static void main (String [] arg) 
    {
        System.out.print("Type a number: ");
        double n = new Scanner(System.in).nextDouble();

        if(n>0)
            System.out.println(n +" is a positive number");
        else if(n<0)
            System.out.println(n +" is a negative number");
        else
            System.out.println(n +" is a zero number");

        System.out.print("\nType your name: ");
        String name = new Scanner(System.in).nextLine();

        System.out.println("Hello "+ name);
    }
}

/*
    3) No, the program did not run well.
    Output : Exception in thread "main" java.util.InputMismatchException

    4) The program will terminate from / skip this code "if(n>0)" and onwards.

    5) InputMismatchException.
    User suppose to enter a double datatype but he/she inserted an string datatype

    Conclusion1: catch block/handler; skip; terminate
 */