// class definition of QuizScores
public class QuizScores {

    // private field : array (double type) holds quiz score
    private double [] quizSc;

    // public constructor, accept array scores and assign to class array
    public QuizScores(double[] quizSc){
        this.quizSc = quizSc;
    }

    // public method : return average score
    public double getAverage( ){
        double total=0;
        for(int i=0; i<quizSc.length; i++){
                total += quizSc[i]; }
        double average = total / quizSc.length;
        return average;
    }

    // public method : return grade based on average
    public char getGrade( ){
        char grade=' ';
        grade = getAverage()>=17 && getAverage()<=20 ? 'A' :
                getAverage()>=15 && getAverage()<17 ? 'B' :
                getAverage()>=10 && getAverage()<15 ? 'C' :
                getAverage()>=5 && getAverage()<10 ? 'D' :
                getAverage()<5 ? 'F' :
                'X' ;
        return grade;
    }

//    public char getGrade( ){
//        char grade=' ';
//        if(getAverage()>=17 && getAverage()<=20)
//            grade = 'A';
//        else if(getAverage()>=15 && getAverage()<17)
//            grade = 'B';
//        else if(getAverage()>=10 && getAverage()<15)
//            grade = 'C';
//        else if(getAverage()>=5 && getAverage()<10)
//            grade = 'D';
//        else if(getAverage()<5)
//            grade = 'F';
//        else
//            grade = 'X';
//        return grade;
//    }

    // public method : return max score
    public double getMaxScore( ){
        double max = quizSc[0];
        for(int i=1; i<quizSc.length; i++){
            if(quizSc[i] > max)
                max = quizSc[i]; }
        return max;
    }
}
