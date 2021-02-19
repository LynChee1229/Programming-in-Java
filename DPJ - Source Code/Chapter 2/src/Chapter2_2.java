// check odd/even num
import java.util.Scanner;

public class Chapter2_2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a number : ");
        int num = input.nextInt();

        String output = (num%2) > 0 ? " odd " : " even " ;
        System.out.println(num + " is an" + output + "number.");
    }
}
