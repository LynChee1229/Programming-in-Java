// CHAN LIN CHEE 1191202546
// TT6V
// Lab 5A - Question 1

import java.util.Scanner;

// superclass
class Staff {
    private String staffName, staffID;
    private double salary;

    public Staff (String name, String ID, double basicPay) {
        staffName = name;
        staffID = ID;
        salary = basicPay;
    }
    public String getName ( ) { return staffName; }
    public String getID ( ) { return staffID; }
    public double getSalary ( ) { return salary; }
}

// subclass
class SalesExecutive extends Staff {
    private double[] sales;
    private int[] peerReview;
    private double avgSales, avgReview;

    public SalesExecutive (String name, String ID, double basicPay) {
        super(name,ID,basicPay);
    }
    public void setSales (double[] allSales) {
        sales = allSales;
    }
    public void setPeerReview (int[] peerReview) {
        this.peerReview = peerReview;
    }
    public double getAverageSales ( ) {
        double total = 0;
        for(int i=0; i<sales.length; i++) {
            total += sales[i];
        }
        avgSales = total/sales.length;
        return avgSales;
    }
    public double getCommissionRate ( ) {
        double commRate =   avgSales<7000 ? 0.00 :
                            avgSales>=7000 && avgSales<=10000 ? 0.10 :
                            avgSales>10000 && avgSales<=15000 ? 0.15 :
                            0.20;
        return commRate;
    }
    public double getAveragePeerReview ( ) {
        double total = 0;
        for(int j=0; j<peerReview.length; j++) {
            total += peerReview[j];
        }
        avgReview = total/peerReview.length;
        return avgReview;
    }
    public double getPeerReviewRate ( ) {
        double peerReviewRate = avgReview>=4.00 && avgReview<=5.00 ? 0.050 :
                                avgReview>=3.00 && avgReview<4.00 ? 0.025 :
                                avgReview>=2.50 && avgReview<3.00 ? 0.001 :
                                0.000;
        return peerReviewRate;
    }
    public double getSalary ( ) {
        return super.getSalary()
                + (super.getSalary()*getCommissionRate())
                + (super.getSalary()*getPeerReviewRate());
    }
}

public class Lab5aQ1 {
    public static void main (String [] args) {
        System.out.print("Enter staff name      : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter staff ID        : ");
        String ID = new Scanner(System.in).nextLine();
        System.out.print("Enter the basic pay   : $");
        double basic = new Scanner(System.in).nextDouble();

        SalesExecutive object = new SalesExecutive(name,ID,basic);

        System.out.println("\n--- Part 1: Sales Collection ---");
        System.out.print("How many months? ");
        int month = new Scanner(System.in).nextInt();

        double[] sales = new double[month];
        System.out.println("Enter the collection of sales for each month: ");
        for(int j=0; j<month; j++) {
            System.out.print("Month " + (j+1) + " = $");
            sales[j] = new Scanner(System.in).nextDouble();
        }
        object.setSales(sales);
        System.out.println("Average Sales : $" + String.format("%.2f",object.getAverageSales()));

        int[] peerReview = new int[3];
        System.out.println("\n--- Part 2: Peer Review (3 peers)");
        System.out.println("Enter the assessment point from 3 peers: [1-5]");
        for(int i=0; i<3; i++) {
            System.out.print("Peer " + (i+1) + " = ");
            peerReview[i] = new Scanner(System.in).nextInt();
        }
        object.setPeerReview(peerReview);
        System.out.println("Average Review Points from Peers: " + String.format("%.2f",object.getAveragePeerReview()));

        System.out.println("\n--- Calculating Bonus & Total Salary of Sales Executive ---");
        System.out.println("Staff ID        : " + object.getID());
        System.out.println("Staff Name      : " + object.getName());
        System.out.println("Basic Salary    : $ " + String.format("%.2f",basic));
        System.out.println("Percentage of the sales commission  : " + object.getCommissionRate()*100 + "%");
        System.out.println("Bonus percentage from peer reviews  : " + object.getPeerReviewRate()*100 + "%");
        System.out.println("Bonus amount from sales collection  : $" + String.format("%.2f",basic*object.getCommissionRate()));
        System.out.println("Bonus amount from peer reviews      : $" + String.format("%.2f",basic*object.getPeerReviewRate()));
        System.out.println("Total salary : $" + String.format("%.2f",object.getSalary()));
    }
}
