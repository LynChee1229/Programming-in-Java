public class TestRectangle {
    public static void main(String [] args){
        Rect boxA = new Rect();
        System.out.println("Number of current Rect objects : "+boxA.getNumOfObj());

        Rect boxB = new Rect("Blue",3,5);
        System.out.println("Number of current Rect objects : "+boxB.getNumOfObj());

        // all objects sharing the same static fields.
        System.out.println("Total number of objects using boxA : "+boxA.getNumOfObj());
    }
}

class Rect{
    private double width = 2, length = 4;
    private String colour = "Black";
    public static int numOfObj = 0;

    public Rect( ){
        numOfObj++;
    }

    public Rect(String colour, double width, double length){
        this.colour = colour;
        this.width = width;
        this.length = length;
        numOfObj++;
    }

    public int getNumOfObj( ){
        return numOfObj;
    }
}