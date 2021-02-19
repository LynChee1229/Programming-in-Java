import java.util.Scanner;

public class Chapter2_Ex4 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        int i=0, pass=0, fail=0, num;
        double mark;
        do {
            System.out.print("Enter the mark #" + ++i + " : ");
            mark = get.nextDouble();

            if(mark!=-1)
                num = (mark>=60) ? (++pass) : (++fail);
        }while(mark!=-1);
        System.out.println("\nNumber of pass  : " + pass +
                "\nNumber of fail  : " + fail );
    }
}
