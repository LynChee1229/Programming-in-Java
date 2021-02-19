// direct invoke STATIC method in class without creating object

import java.util.Scanner;

public class MetricDemo {
    public static void main(String [] args) {
        Scanner get = new Scanner(System.in);
        double mile, km, ans;

        System.out.println("[1] Miles to KM ");
        System.out.println("[2] KM to Miles ");
        System.out.print("Enter your choice : ");
        int choice = get.nextInt();

        if (choice == 1) {
            System.out.print("\nEnter Miles : ");
            mile = get.nextDouble();
            ans = Metric.MilesToKM(mile);
            System.out.println(mile + " miles is " + String.format("%.4f",ans) + " KM.");
        }
        else if (choice == 2) {
            System.out.print("\nEnter KM : ");
            km = get.nextDouble();
            ans = Metric.KMToMiles(km);
            System.out.println(km + " km is " + String.format("%.4f",ans) + " miles.");
        }
    }
}

class Metric{
    public static double MilesToKM(double mile){
        return (mile*1.60934);
    }
    public static double KMToMiles(double km){
        return (km/1.60934);
    }
}