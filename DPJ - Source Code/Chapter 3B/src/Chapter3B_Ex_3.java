import java.util.Scanner;

public class Chapter3B_Ex_3 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        final int num = 5;
        int[] age = new int[num];

        for(int i=0; i<num; i++){
            System.out.print("Enter visitor "+(i+1)+" age : ");
            age[i] = get.nextInt();
        }
        int min = age[0], max = age[0];

        for(int i=1; i<num; i++){
            if(age[i]>max){
                max = age[i];   }       // end if
            if(age[i]<min){
                min = age[i];   }       // end if
        }   // end for
        System.out.println("\nThe oldest visitor is "+max+" years old.");
        System.out.println("The youngest visitor is "+min+" years old.");
    }   // end main
}   // end class
