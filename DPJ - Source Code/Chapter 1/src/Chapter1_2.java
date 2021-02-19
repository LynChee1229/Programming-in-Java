import java.util.Scanner;

public class Chapter1_2 {
    public static void main(String [] args){
        int num1, num2, sum;
        Scanner get = new Scanner(System.in);

        System.out.print("Enter first number    : ");
        num1 = get.nextInt();
        System.out.print("Enter second number   : ");
        num2 = get.nextInt();

        sum = num1 + num2;
        System.out.println("\nFirst Number \"" + num1 + "\" + " + "Second Number \"" + num2 + "\" = " + sum);
    }
}
