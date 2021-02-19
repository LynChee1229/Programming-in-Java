public class eg2_tryCatch_ArrayIndexOutOfBounds {
    public static void main (String [] args) {
        int[] num = {3,4,5};

        try {
            for(int x=0; x<=3; x++) {           // condition should be x<3 OR x<=2
                System.out.println("Index " + x + " is : " + num[x]);     // ArrayIndexOutOfBounds Exception
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nError. The next element is not existed.");
        }

        System.out.println("Can read this? ");
    }
}
