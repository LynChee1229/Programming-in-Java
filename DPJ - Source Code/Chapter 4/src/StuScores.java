public class StuScores {
    private double[][] student;    // declaration only.

    public StuScores(double [][] student){      // constructor
        this.student = student;
    }

    public void getAverage( ){
        for(int i=0; i<student.length; i++){
            double total = 0;
            for(int j=0; j<student[i].length; j++){
                total += student[i][j];
            }
            double avg = total / student[i].length;
            System.out.println("Average mark for student "+(i+1)+" is : "+avg);
        }
    }
}
