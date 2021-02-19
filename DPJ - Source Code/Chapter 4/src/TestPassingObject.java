// create --- must have keyword 'new'

import java.util.Scanner;

public class TestPassingObject {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);   // declare and create

        System.out.print("Enter carpet colour : ");
        String colour = get.nextLine();
        System.out.print("Enter carpet width  : ");
        double width = get.nextDouble();
        System.out.print("Enter carpet length : ");
        double length = get.nextDouble();

        // Rectangle2 carpet : Only declaring an object, but did not creating yet.
        Rectangle2 carpet = createCarpet(colour,width,length);      // invoke createCarpet method to create and return a object

        displayCarpet(carpet);
        System.out.println("\nBack to main >> Carpet is "+carpet.getColour()+".");
    }

    // return type is an object of class Rectangle2
    public static Rectangle2 createCarpet(String c, double w, double l){
        Rectangle2 newCarpet = new Rectangle2(c,w,l);       // declare and creating an object with arguments
        return newCarpet;       // return a object of Rectangle2
    }

    public static void displayCarpet(Rectangle2 carpet1){
        Rectangle2 carpet2 = new Rectangle2();              // declare and creating an object without argument

        System.out.println("\nCarpet is "+carpet1.getColour());
        System.out.println("Carpet area is "+carpet1.calculateArea());
        System.out.println("Carpet perimeter is "+carpet1.calculatePerimeter());
        System.out.println("\nCarpet is "+carpet2.getColour());
        System.out.println("Carpet area is "+carpet2.calculateArea());
        System.out.println("Carpet perimeter is "+carpet2.calculatePerimeter());
    }
}
