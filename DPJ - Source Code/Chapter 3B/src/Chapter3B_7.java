// multiple dimensional array
// printf to make output align

public class Chapter3B_7 {
    public static void main(String [] args){
        int[][] arr = { {5,7,3} , {4,6,9} , {10,1,8} , {89,3,66} };
        for(int j=0; j<4; j++){
            for(int i=0; i<3; i++){
                System.out.printf(" %-5d",arr[j][i]);  }
            System.out.println();
        }
    }
}
