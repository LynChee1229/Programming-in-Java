import java.util.Scanner;
import java.lang.Math;

class Circle {
    private double radius = 1.0;

    public double getRadius ( ) {  return radius;   }
    public void setRadius (double radius) { this.radius = radius;   }
    public double findArea ( ) { return (3.142 * Math.pow(radius,2));     }
}

class Cylinder extends Circle{
    private double length = 1.0;

    public double getLength ( ) { return length;    }
    public void setLength (double length) { this.length = length;   }
    public double findVolume ( ) { return (super.findArea() * length);  }

    // overriding method findArea:
    public double findArea ( ) { return ( 2*super.findArea() + 2*3.142*getRadius()*getLength() );     }
}

public class CylinderDemo {
    public static void main (String [] args) {
        Scanner get = new Scanner(System.in);
        Cylinder pepsiCan = new Cylinder();

        System.out.print("Length of the can : ");
        pepsiCan.setLength(get.nextDouble());

        System.out.print("Radius of the can : ");
        pepsiCan.setRadius(get.nextDouble());

        System.out.println("\n>> The volume of this can  : " + String.format("%.2f",pepsiCan.findVolume()));
        System.out.println(">> The surface area of this can  : " + String.format("%.2f",pepsiCan.findArea()));
    }
}
