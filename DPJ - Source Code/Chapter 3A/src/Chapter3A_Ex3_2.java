// manually casting (without round up)

public class Chapter3A_Ex3_2 {
    public static void main(String [] args){
        // set two num, not from user input.
        float num1 = 19.27f;        // 'f' behind value
        float num2 = 8.52f;         // 'f' behind value
        int diff = casting(num1,num2);
        System.out.println("\nThe integer different between " + num1 + " & " + num2 +
                " is " + diff + ".");
    }

    public static int casting(float num1, float num2){
        int diff = (int)(num1 - num2);
        return diff;
    }
}
