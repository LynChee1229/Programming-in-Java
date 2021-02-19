// passing by value (does not affect the original argument.

public class Chapter3A_3 {
    public static void main(String [] args){
        int num = 85;
        System.out.println("The number is " + num + ".");
        change(num);
        System.out.println("Back into the main method.");
        System.out.println("The value now is " + num + ".");
    }

    public static void change(int x){
        System.out.println("I am inside change method.");
        x = 29;
        System.out.println("Now, the value is " + x + ".");
    }
}
