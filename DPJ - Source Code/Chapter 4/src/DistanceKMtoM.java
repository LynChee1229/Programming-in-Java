import java.util.Scanner;

class Distance {
    double KiloM, Meter;

    public Distance(double Kilo){
        KiloM = Kilo;
    }

    public double KMtoM( ){
        Meter = KiloM*1000;
        return Meter;
    }
}

public class DistanceKMtoM {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a value in Kilometer (km) : ");
        double valueKM = get.nextDouble();

        // create an object
        Distance newDist = new Distance(valueKM);

        // invoke a method to return a value
        System.out.println("\nThe value of "+valueKM+" KM in M is "+newDist.KMtoM()+" meters.");
    }
}
