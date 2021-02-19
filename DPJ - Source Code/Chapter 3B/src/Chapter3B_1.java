import java.util.Scanner;

public class Chapter3B_1 {
    public static void main(String [] args){
        final int num = 3;
        int[] hours = new int [num];
        Scanner get = new Scanner(System.in);
        System.out.println("Enter the hours worked by "+num+" employees.");

        System.out.print("Employee 1 : ");
        hours[0] = get.nextInt();

        System.out.print("Employee 2 : ");
        hours[1] = get.nextInt();

        System.out.print("Employee 3 : ");
        hours[2] = get.nextInt();

        System.out.println("\nThe hours worked by each employees are:");
        System.out.println("Employee 1 : "+hours[0]);
        System.out.println("Employee 2 : "+hours[1]);
        System.out.println("Employee 3 : "+hours[2]);
    }
}
