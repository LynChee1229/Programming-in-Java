import java.util.Scanner;

public class Chapter3A_Ex1 {
    public static Scanner get = new Scanner(System.in);
    public static void main(String [] args){
        int num1 = getInt();
        System.out.println(num1 + " is coming from getInt()");
        double num2 = getDouble();
        System.out.println(num2 + " is coming from getDouble()");
    }

    public static int getInt(){
        System.out.print("Enter a number : ");
        int num = get.nextInt();
        return num;
    }

    public static double getDouble(){
        System.out.print("Enter a number : ");
        double num = get.nextDouble();
        return num;
    }
}
