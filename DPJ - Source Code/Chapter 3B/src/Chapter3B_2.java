import java.util.Scanner;

public class Chapter3B_2 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter employee number : ");
        int num = get.nextInt();
        int[] hours = new int[num];

        System.out.println("\nEnter the hours worked by "+num+" employees.");
        for(int j=0; j<num; j++){
            System.out.print("Employee "+(j+1)+" : ");
            hours[j] = get.nextInt();
        }

        System.out.println("\nThe hours worked by each employees are:");
        for(int i=0; i<num; i++){
            System.out.println("Employee "+(i+1)+" : "+hours[i]);
        }
    }
}
