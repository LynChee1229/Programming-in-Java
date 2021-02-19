// casting (without round up)

public class Chapter3A_Ex3_1 {
    public static void main(String [] args){
        // set two num, not from user input.
        double num1 = 19.27;
        double num2 = 8.52;
        int diff = casting(num1,num2);
        System.out.println("\nThe integer different between " + num1 + " & " + num2 +
                " is " + diff + ".");
    }

    public static int casting(double num1, double num2){
        int diff = (int)(num1 - num2);
        return diff;
    }
}
