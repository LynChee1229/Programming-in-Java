// Lab 3B eg2 : SeriesOfNumbers.java

import java.util.Scanner;

public class SeriesOfNumbers {
    public static void main(String [] args){
        System.out.print("How many series of number you want to create? : ");
        int size = new Scanner(System.in).nextInt();
        int[] numbers = new int[size];
        getValues(numbers);
        getTotal(numbers);
        int high = getHighest(numbers);
        System.out.println("The highest value is : "+high);
        showValues(numbers);
    }

    // void method, accepts array as parameter, asks user to enter a number for each element.
    public static void getValues(int[] values){
        System.out.println("\nEnter a series of  "+values.length+" numbers.");
        for(int j=0; j<values.length; j++) {
            System.out.print("Number "+(j+1)+" : ");
            values[j] = new Scanner(System.in).nextInt();
        }
    }

    // void method, accepts array as parameter, calculate the total and print the result.
    public static void getTotal(int[] values){
        int total=0;
        for(int j=0; j<values.length; j++) {
            total += values[j];
        }

        // print the total
        System.out.println("\nTotal of the numbers is : "+total);
    }

    // return method, accepts array as parameter, find the highest number and return it
    public static int getHighest(int[] values){
        int highest = values[0];
        for(int j=1; j<values.length; j++) {
            if(values[j] > highest)
                highest = values[j];
        }
        return highest;
    }

    // void method, accepts array as parameter, print all numbers in the array
    public static void showValues(int[] values){
        System.out.println("\nThese are the numbers in the array:");
        for(int j=0; j<values.length; j++) {
            System.out.print(values[j]+" ");
        }
        System.out.println();
    }
} // end class
