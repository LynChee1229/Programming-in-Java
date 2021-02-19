public class Chapter3A_6 {
    public static void main(String [] args){
        System.out.println("The max between 12 and 29 is >> " + getMax(12,29));
        System.out.println("The max between 12.0 and 29.0 is >> " + getMax(12.0,29.0));     // if you write 12 & 29, won't get 29.0
        System.out.println("The max between 12.0, 5.8 and 29.0 is >> " + getMax(12,5.8,29));
    }

    public static int getMax(int x, int y){
        int max;
        if(x>y)
            max = x;
        else
            max = y;
        return max;
    }

    public static double getMax(double x, double y){
        double max;
        if(x>y)
            max = x;
        else
            max = y;
        return max;
    }

    public static double getMax(double x, double y, double z){
        return getMax(getMax(x,y),z);
    }
}
