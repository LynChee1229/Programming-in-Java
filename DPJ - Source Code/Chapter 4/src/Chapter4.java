import java.util.Scanner;

public class Chapter4 {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);

        System.out.print("How many students in the class?  : ");
        int stud = get.nextInt();
        System.out.print("How many test each student take? : ");
        int test = get.nextInt();

        double [][] stuMark = new double[stud][test];

        for (int j=0; j<stuMark.length; j++){
            System.out.println("\nEnter the student "+(j+1)+" mark.. ");
            for (int i=0; i<stuMark[j].length; i++){
                System.out.print("Enter test "+(i+1)+" mark : ");
                stuMark[j][i] = get.nextDouble();
            }
        }
        System.out.println();
        StuScores classMark = new StuScores(stuMark);
        classMark.getAverage();
    }
}
