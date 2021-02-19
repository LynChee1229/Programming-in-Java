// Lab 2 eg1 : AboutNumbers.java

import java.util.Scanner;

public class AboutNumbers {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        for (int j=0; j<5; j++){
            System.out.print("Enter a number : ");
            double n = input.nextDouble();

            if(n>0)
                System.out.println(n + " is a positive number.\n");
            else if(n<0)
                System.out.println(n + " is a negative number.\n");
            else
                System.out.println(n + " is a zero number.\n");
        }
    }
}
