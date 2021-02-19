public class RectangleDemo {
    public static void main(String [] args){

        // declare and create an object for Rectangle called boxA
        Rectangle boxA = new Rectangle();   // invoke default constructor

        boxA.setLength(10);         // mutator
        boxA.setWidth(5);           // mutator

        System.out.println("[ Box A Calculation ]");
        System.out.println("Box A's length is "+boxA.getLength());      // accessor
        System.out.println("Box A's width is "+boxA.getWidth());        // accessor
        System.out.println("Box A's area is "+boxA.getArea());          // accessor

        // create an object for Rectangle with two parameters
        Rectangle boxB = new Rectangle(12,4);   // invoke constructor with arguments

        System.out.println("\n[ Box B Calculation ]");
        System.out.println("Box B's length is "+boxB.getLength());      // accessor
        System.out.println("Box B's width is "+boxB.getWidth());        // accessor
        System.out.println("Box B's area is "+boxB.getArea());          // accessor
    }
}
