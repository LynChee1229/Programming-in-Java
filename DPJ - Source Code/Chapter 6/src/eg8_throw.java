import java.util.Scanner;

public class eg8_throw {
    public static int num;

    public static void main (String [] args) {
        System.out.print("Enter an integer : ");
        try {
            methodA();                                  // being thrown back here from methodA
        }
        catch (RuntimeException e) {
            System.out.println("Input error.");
        }
    }

    public static void methodA (){
        methodB();                                      // throw back to main if an exception is thrown
    }

    public static void methodB (){
        num = new Scanner(System.in).nextInt();
        System.out.println("The number is " + num);     // throw back to methodA if an exception is thrown
    }
}
