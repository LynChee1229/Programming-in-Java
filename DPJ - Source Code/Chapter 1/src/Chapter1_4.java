// conditional operator
import java.util.Scanner;

public class Chapter1_4 {
        public static void main(String [] args){
            double mark;
            String output;
            Scanner get = new Scanner(System.in);

            System.out.print("Enter your mark : ");
            mark = get.nextDouble();

            output = mark >= 60 ? " >> You pass" : " >> You fail";
            System.out.println(output);
        }
}
