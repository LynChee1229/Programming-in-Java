//JAVA will truncate the decimal remainder without rounded off when int divide by int

public class Chapter2_1 {
    public static void main(String [] args){
        System.out.println(1/2);
        System.out.println(2/3);
        System.out.println(12/7);

        int num1 = 5, num2, num3;
        num2 = 8;
        System.out.println(num2);
        num2 *= 2;
        System.out.println(num2);
        num3 = 9;
        num3 /= num1;
        System.out.println(num3);       // truncate remainder
    }
}
