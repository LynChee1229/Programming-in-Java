// Lab 2 eg2 : WindStatus.java

import java.util.Scanner;

public class WindStatus {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String status = "";
        boolean wish;

        do {
            System.out.print("Enter the wind speed = ");
            double wind = input.nextDouble();

            if(wind<39)
                status = "Windy";
            else if(wind>=39 && wind<55)
                status = "Gale";
            else if(wind>=55)
                status = "Storm";

            System.out.println("It is " + status + ".");

            System.out.print("Do you wish to continues? [true/false] : ");
            wish = input.nextBoolean();
            System.out.println();
        }while(wish==true);
    }
}
