import java.util.Scanner;

public class Chapter3B_Ex_2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of taken food : ");
        int num = get.nextInt();
        double[] calories = new double[num];

        System.out.println();

        for(int j=0; j<num; j++){
            System.out.print("Enter food "+(j+1)+" calories (kJ) : ");
            calories[j] = get.nextDouble();
        }

        System.out.println();

        for(int i=0; i<num; i++){
            System.out.println("Food "+(i+1)+" calories : "+calories[i]+" kJ");
        }
    }
}
