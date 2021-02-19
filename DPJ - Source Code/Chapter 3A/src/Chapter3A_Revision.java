// formatting & casting do not affect other sentences.
import java.util.Scanner;

public class Chapter3A_Revision {
    public static Scanner get = new Scanner(System.in);

    public static void main(String [] args){
        double height = getHeight();
        double width = getWidth();
        double area = calArea(height,width);

        // can input variables with 10 decimal to see the differences
        System.out.println("\nThe area of the rectangle is "+area+".");
        System.out.println("The area of the rectangle is "+String.format("%.5f",area)+".");     // format
        System.out.println("The area of the rectangle is "+(float)area+".");                    // cast
        System.out.println("The area of the rectangle is "+area+".");           // prove that String.format and (float) casting doesn't effect the variable
    }

    public static double getHeight(){
        System.out.print("Enter the height of a rectangle   : ");
        return get.nextDouble();
    }

    public static double getWidth(){
        System.out.print("Enter the width of a rectangle    : ");
        return get.nextDouble();
    }

    public static double calArea(double h, double w){
        return h*w;
    }
}
