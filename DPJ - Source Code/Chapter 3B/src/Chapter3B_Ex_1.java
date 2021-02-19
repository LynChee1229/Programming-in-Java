import java.util.Scanner;

public class Chapter3B_Ex_1 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        double[] donation = new double[5];
        double total = 0;
        for(int j=0; j<5; j++){
            System.out.print("Enter donation amount "+(j+1)+" : RM ");
            donation[j] = get.nextDouble();
            total += donation[j];
        }
        System.out.printf("\nTotal amount of donation = RM %.2f",total);
    }
}
