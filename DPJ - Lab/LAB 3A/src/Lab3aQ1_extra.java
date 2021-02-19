import java.util.Scanner;

public class Lab3aQ1_extra {
    static int total = 0;
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0; i<3; i++){
            System.out.print("Enter score for Quiz "+(i+1)+" : ");
            num[i] = get.nextInt();
        }
        getTotal(num);
        double average = getAverage();
        printAll(average);
    }

    public static void getTotal(int[] numbers){
        for(int i=0; i<3; i++){
            total += numbers[i];
        }
    }

    public static double getAverage(){
        return (double)total/3;
    }

    public static void printAll(double avg){
        System.out.println("The total score of the quizzes is = "+total);
        System.out.printf("The average of score is = %.2f\n",avg);
    }
}
