import java.util.Scanner;
import java.lang.Math;

public class eg5_throw_tryCatch_IllegalArgument {
    public static void main (String [] args) {
        System.out.print("Enter the radius of the circle : ");
        double radius = new Scanner(System.in).nextDouble();
        double area;
        try {
            if(radius<=0.00) {
                throw new IllegalArgumentException("[Radius cannot be ZERO or NEGATIVE]");
            }
            else {
                area = 3.142 * Math.pow(radius,2);
                System.out.println("The area of the circle is : " + area);
            }
        }
        catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
