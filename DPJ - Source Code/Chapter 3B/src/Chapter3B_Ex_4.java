public class Chapter3B_Ex_4 {
    public static void main(String [] args){
        double[][] test = { {10,7} , {6,5} , {2,8} , {9,3.5} , {7.5,9.5}};

        for(int i=0; i<5; i++){
            double total = 0;
            for(int j=0; j<2; j++){
                total += test[i][j];
            }
            double average = total / 2;
            System.out.println("Average mark for student "+(i+1)+" : "+average);
        }
    }
}
