import java.util.Scanner;

public class Chapter2_Ex3 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter the shipping costs      : RM ");
        double shipping = get.nextDouble();
        System.out.print("Enter the fuel and toll costs : RM ");
        double driving = get.nextDouble();

        String output = (shipping<=driving) ? "Online." : "At the mall.";
        System.out.println("\nSuggest method : " + output);
    }
}
