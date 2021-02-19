import java.util.Scanner;

public class Chapter2_Ex5 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("\nEnter number #" + (i+1) + " : ");
            double num = get.nextDouble();
            if(num>0)
                System.out.println("\"" + num + " \" is a positive number.");
            else if(num<0)
                System.out.println("\"" + num + " \" is a negative number.");
            else
                System.out.println("\"" + num + " \" is zero.");
        }
    }
}
