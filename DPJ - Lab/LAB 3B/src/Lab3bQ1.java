// CHAN LIN CHEE 1191202546
// TT6V
// Lab 3B - Question 1

import java.util.Scanner;

public class Lab3bQ1 {
    public static void main(String [] args){
        int[] books = new int[10];
        int[] points = new int[10];

        System.out.println("Enter the number of book purchased by : ");
        for(int j=0; j<books.length; j++){
            System.out.print("Customer #"+(j+1)+" = ");
            books[j] = new Scanner(System.in).nextInt();
        }

        System.out.println("\nReview for 10 Selected Customers.");
        getPoints(books,points);

        System.out.println("Points Awarded : ");
        for(int i=0; i<points.length; i++){
            System.out.println("Customer #"+(i+1)+" = "+points[i]+" points");
        }

        int total = getTotal(books);
        System.out.println("\nTotal books purchased : "+total);

        int highest = getHighest(points);
        System.out.println("Highest points : Customer "+highest);

        int lowest = getLowest(points);
        System.out.println("Lowest points  : Customer "+lowest);

    }

    public static void getPoints(int[] b, int[] p){
        for(int i=0; i<b.length; i++){
            if(b[i]>=1 && b[i]<=3)
                p[i] = 10;
            else if(b[i]>=4 && b[i]<=6)
                p[i] = 25;
            else if(b[i]>=7 && b[i]<=9)
                p[i] = 40;
            else if(b[i]>=10)
                p[i] = 75;
        }
    }

    public static int getTotal(int[] b){
        int sum = 0;
        for(int i=0; i<b.length; i++){
            sum += b[i];
        }
        return sum;
    }

    public static int getHighest(int[] p){
        int high=p[0], indexMax=0;
        for(int i=1; i<p.length; i++){
            if(p[i] > high) {
                high = p[i];
                indexMax = i+1;
            }
        }
        return indexMax;
    }

    public static int getLowest(int[] p){
        int low=p[0], indexMin=0;
        for(int i=1; i<p.length; i++){
            if(p[i] < low){
                low = p[i];
                indexMin = i+1;
            }
        }
        return indexMin;
    }
}
