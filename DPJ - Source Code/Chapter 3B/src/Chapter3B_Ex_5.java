import java.util.Scanner;

public class Chapter3B_Ex_5 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the number of students : ");
        int stud = get.nextInt();
        System.out.print("Enter the number of tests : ");
        int test = get.nextInt();

        double[][] marks = new double[stud][test];

        for(int i=0; i<stud; i++){
            System.out.println("\nEnter marks for student "+(i+1)+" : ");
            for(int j=0; j<test; j++){
                System.out.print("Test "+(j+1)+" >> ");
                marks[i][j] = get.nextDouble();
            }
        }

        System.out.println();

        for(int i=0; i<stud; i++){
            double total = 0;
            for(int j=0; j<test; j++){
                total += marks[i][j];
            }
            double average = total / 2;
            System.out.println("Average mark for student "+(i+1)+" : "+average);
        }
    }
}
