import java.util.InputMismatchException;
import java.util.Scanner;

public class eg3_tryCatch_InputMismatchException {
    public static void main (String [] args) {
        int num;
        System.out.print("\n[10 times multiplication] \n\nEnter a number : ");

        try {
            num = new Scanner(System.in).nextInt();
            System.out.println("\nThe number is " + num);
        }
        catch (InputMismatchException e) {
            System.out.println("\nWrong input type");
            num = 1;
            System.out.println("Using default number : " + num + "\n");
        }
        System.out.println(num + " multiple 10 is : " + (num*10));
    }
}
