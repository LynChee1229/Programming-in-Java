// if else
import java.util.Scanner;

public class Chapter1_3 {
    public static void main(String [] args){
        double mark;
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your mark : ");
        mark = get.nextDouble();

        if(mark>60)
            System.out.println(" >> You pass");
        else
            System.out.println(" >> You fail");
    }
}
