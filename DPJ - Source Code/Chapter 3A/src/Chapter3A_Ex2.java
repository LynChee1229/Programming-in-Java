import java.util.Scanner;

public class Chapter3A_Ex2 {
    public static void main(String [] args){
        double num;
        for(int i=0;i<5;i++){
            num = getNum(i);
            if(num>0)
                System.out.println(num + " is a positive number.\n");
            else if(num<0)
                System.out.println(num + " is a negative number.\n");
            else
                System.out.println(num + " is a zero.\n");
        }
    }

    public static double getNum(int i){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter number #" + (i+1) + " : ");
        double num = get.nextDouble();
        return num;
    }
}
