import java.util.Scanner;

public class Chapter2_Ex2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        double distance = 320;
        double cost;

        System.out.print("Enter the price of petrol : RM ");
        double priceOfPetrol = get.nextDouble();
        System.out.print("Enter the average kilometer per liter car consume : " );
        double avgKLperL = get.nextDouble();

        double price = priceOfPetrol*((distance*2)/avgKLperL);      // distance multiply 2 because return
        System.out.printf("\nCosts of petrol needed : RM %.2f\n",price);
    }
}
