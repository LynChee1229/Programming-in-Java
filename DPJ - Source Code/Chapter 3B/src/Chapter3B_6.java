// primitive variable pass by value
// array pass by reference (same memory location)

public class Chapter3B_6 {
    public static void main(String [] args){
        int x = 8;
        int[] y = new int[5];
        x = methodArr(x,y);
        System.out.println("x is "+x);
        System.out.println("y[0] is "+y[0]);
    }

    public static int methodArr(int a, int[] b){
        a = 120;
        b[0] = 240;
        return a;       // return to change primitive variable
    }
}
