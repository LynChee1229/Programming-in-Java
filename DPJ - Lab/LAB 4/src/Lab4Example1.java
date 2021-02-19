import java.util.Scanner;

public class Lab4Example1 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the item name : ");
        String itemName = get.nextLine();
        System.out.print("Enter the price per unit : RM ");
        double price = get.nextDouble();
        System.out.print("Quantity sold : ");
        int quantity = get.nextInt();

        RetailItem itmOjb = new RetailItem(itemName,price,quantity);

        System.out.printf("\n%-15s %-15s %-15s\n","Item","Quantity","Price (RM)");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-15d %-13.2f\n",itmOjb.getItemName(),itmOjb.getQuantity(),itmOjb.getPrice());
        System.out.printf("\nTotal Price    :   RM %.2f\n",itmOjb.getTotalPrice());
        System.out.printf("Discount       :   %.1f%%\n",(itmOjb.getDiscount()*100));
        System.out.printf("Total Payment  :   RM %.2f\n",itmOjb.getTotalPayment());

    }
}
