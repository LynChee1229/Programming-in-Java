// overloading methods : same name, different parameters

public class Chapter3A_5 {
    public static void main(String [] args){
        int num1 = 58, num2 = 12, num3 = 67, max;
        max = getMax(num1,num2);
        System.out.println("The maximum number between " + num1 + ", " + num2 + " is >> " + max + ".");
        max = getMax(num1,num2,num3);
        System.out.println("The maximum number among " + num1 + ", " + num2 + ",and " + num3 + " is >> " + max + ".");
    }

    public static int getMax(int x, int y){
        int max;
        if(x>y)
            max = x;
        else
            max = y;
        return max;
    }

    public static int getMax(int x, int y, int z){
        // nested function call
        return getMax(getMax(x,y),z);       // operations inline with return.
    }
}
