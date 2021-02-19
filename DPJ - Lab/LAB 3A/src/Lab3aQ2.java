// CHAN LIN CHEE 1191202546
// TT6V
// Lab 3A - Question 2

import java.util.Scanner;

public class Lab3aQ2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        int choice;
        double conversion;
        String currency=" ";
        do {
            menu();
            System.out.print("Please enter your choice : ");
            choice = get.nextInt();

            if(choice==0){
                System.out.println("Program end.");
                break;
            }

            System.out.print("Please enter the RM amount : ");
            double amount = get.nextDouble();

            switch(choice){
                case 1 :    currency = "SGD";
                            conversion = toSGD(amount);
                            break;
                case 2 :    currency = "IDR";
                            conversion = toIDR(amount);
                            break;
                case 3 :    currency = "THB";
                            conversion = toTHB(amount);
                            break;
                default:    conversion = 0.0;
                            System.out.println("Invalid choice.");
            }
            System.out.printf("\nRM %.2f is equivalent to %s %.2f\n",amount,currency,conversion);
        }while(choice==1 || choice==2 || choice==3);

    }

    public static void menu(){
        System.out.println("\n\t\t  MENU RM Converter\n----------------------------------------");
        System.out.println("  1. Convert to Singapore Dollar (SGD)");
        System.out.println("  2. Convert to Indonesian Rupiah (IDR)");
        System.out.println("  3. Convert to Thai Baht (THB)");
        System.out.println("  0. Exit Program");
        System.out.println("----------------------------------------");
    }

    public static double toSGD(double a){
        return (a*0.32);
    }

    public static double toIDR(double a){
        return (a*3020.20);
    }

    public static double toTHB(double a){
        return (a*7.98);
    }
}
