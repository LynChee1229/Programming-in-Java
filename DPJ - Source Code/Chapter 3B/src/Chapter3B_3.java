// use of array.length

public class Chapter3B_3 {
    public static void main(String [] args){
        double[] score = { 90.5 , 95 , 60 , 105 , 77.5};    // array initialization
        double max = score[0];

        for(int j=1; j<score.length; j++){
            if(score[j] > max){
                max = score[j]; }
        }
        System.out.println("The highest scsore is "+max+".");
    }
}
