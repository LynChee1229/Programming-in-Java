// throw without try-catch

import java.util.Scanner;
import java.lang.Math;

public class eg4_throw_IllegalArgument {
    public static void main (String [] args) {
        System.out.print("Enter the radius of the circle : ");
        double radius = new Scanner(System.in).nextDouble();
        double area;
        if(radius<=0.00) {
            throw new IllegalArgumentException("Radius cannot be ZERO or NEGATIVE");
        }
        else {
            area = 3.142 * Math.pow(radius,2);
            System.out.println("The area of the circle is : " + area);
        }
    }
}
