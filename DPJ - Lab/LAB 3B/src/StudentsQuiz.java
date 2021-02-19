// Lab 3B eg3 : StudentsQuiz.java

public class StudentsQuiz {
    public static void main(String [] args){
        double [][] quiz = { {13, 10, 15.5} , {12.5, 11, 17.5} , {15, 14, 20} };
        calculate_avg(quiz);        // calling the method
    }

    public static void calculate_avg(double[][] marks){
        double average = 0;

        // i and j represent the rows and columns
        for(int i=0; i<marks.length; i++){
            double totalScore = 0;

            for(int j=0; j<marks[i].length; j++){
                totalScore += marks[i][j];
            }
            average = totalScore/marks[i].length;
            System.out.println("\nStudent number "+(i+1));
            System.out.printf("Average score = %.3f\n",average);
        }
    }
} /// end class
