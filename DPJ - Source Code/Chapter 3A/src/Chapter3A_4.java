public class Chapter3A_4 {
    public static void main(String [] args){
        double max = getMax(8.5 , 12.9 , 6.6);
        System.out.println("The maximum number among 8.5, 12.9, and 6.6 is >> " + max + ".");
    }

    public static double getMax(double x,double y,double z){
        double max=0;
        if(x>y && x>z)
            max = x;
        else if(y>z && y>x)
            max = y;
        else if(z>x && z>y)
            max = z;

        return max;
    }
}
