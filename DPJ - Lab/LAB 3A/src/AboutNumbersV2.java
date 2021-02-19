// Lab 3A eg1 : AboutNumbersV2.java

import java.util.Scanner;

public class AboutNumbersV2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        for (int j=0; j<5; j++){
            System.out.print("Enter a number : ");
            double n = input.nextDouble();
            checkNumbers(n);        // calling a method
        }
    }

    // method definition
    public static void checkNumbers(double num){
        if(num>0)
            System.out.println(num + " is a positive number.\n");
        else if(num<0)
            System.out.println(num + " is a negative number.\n");
        else
            System.out.println(num + " is a zero number.\n");
    }
}
