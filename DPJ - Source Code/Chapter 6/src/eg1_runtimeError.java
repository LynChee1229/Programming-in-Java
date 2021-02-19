public class eg1_runtimeError {
    public static void main (String [] args) {
        int[] num = {3,4,5};
        for(int x=0; x<=3; x++) {           // condition should be x<3 OR x<=2
            System.out.println(num[x]);     // ArrayIndexOutOfBounds Exception
        }
        System.out.println("Can read this?");
    }
}
