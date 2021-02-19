// CHAN LIN CHEE 1191202546
// TT6V
// Lab 2 - Question 1

import java.util.Scanner;

public class Lab2Q1 {
    public static void main(String [] args){
            Scanner input = new Scanner(System.in);
            String status = "";
            String wish;

            do {
                System.out.print(" Enter the wind speed = ");
                double wind = input.nextDouble();

                if(wind<39)
                    status = "Windy";
                else if(wind>=39 && wind<55)
                    status = "Gale";
                else if(wind>=55)
                    status = "Storm";

                System.out.println(" It is " + status + ".");

                System.out.print(" Do you wish to continues? [yes/no] : ");
                wish = input.next();
                wish = wish.toLowerCase();
                System.out.println();
            }while(wish.equals("yes"));     // while(wish.equalsIgnoreCase("Yes"));

            System.out.println(" Program End.");
    }
}
