// convert String into int, float, double..

public class Chapter3A_2 {
    public static void main(String [] args){
        int x = 12;
        System.out.println("Passing values to displayValue.\n");
        displayValue(8);
        displayValue(x+5);
        displayValue(x*9);
        displayValue(Integer.parseInt("824"));        // "824" is string, not number.
    }

    public static void displayValue(int m){
        System.out.println("The value is " + m + ".");
    }
}
