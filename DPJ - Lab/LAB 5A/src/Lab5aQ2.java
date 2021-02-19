// CHAN LIN CHEE 1191202546
// TT6V
// Lab 5A - Question 2

import java.util.Scanner;

class Customer {
    private String name, ID;

    public Customer ( ) { }
    public void setName(String name) { this.name = name; }
    public void setID(String ID) { this.ID = ID; }
    public String getName ( ) { return name; }
    public String getID ( ) { return ID; }
}

class SpecialCustomer extends Customer {
    private double amountPurchase, discount;
    private int points;

    public SpecialCustomer (double amountPurchase) { this.amountPurchase = amountPurchase; }
    public double getDiscount ( ) {
        discount =  amountPurchase>=2000 ? 0.10 :
                    amountPurchase>=1500 && amountPurchase<2000 ? 0.07 :
                    amountPurchase>=1000 && amountPurchase<1500 ? 0.06 :
                    amountPurchase>=500 && amountPurchase<1000 ? 0.05 :
                    0.00;
        return discount;
    }
    public int getPoints ( ) {
        if(amountPurchase>=500){
            points = 5;
            points += (amountPurchase-500)*2;
        }
        else
            points = 0;
        return points;
    }

    public String toString() {
        return  "Customer Name  : " + super.getName() +
                "\nCustomer ID    : " + super.getID() +
                "\nDiscount Earned for next purchase  : " + getDiscount()*100 + "%" +
                "\nCustomer Points for today          : " + getPoints();
    }
}

public class Lab5aQ2 {
    public static void main (String [] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter customer name   : ");
        String name = get.nextLine();
        System.out.print("Enter customer ID     : ");
        String ID = get.nextLine();
        System.out.print("Customer's purchases for today    : $");
        double amountPurchase = get.nextDouble();

        SpecialCustomer object = new SpecialCustomer(amountPurchase);
        object.setName(name);
        object.setID(ID);

        System.out.println("\n--- Discount & Points Statement ---");
        System.out.println(object.toString());
    }
}
