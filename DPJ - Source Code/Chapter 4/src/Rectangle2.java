public class Rectangle2 {
    // instance fields OR object data
    private double width = 2;
    private double length = 4;
    private String colour = "black";

    public Rectangle2( ){ }     // constructor without parameter

    public Rectangle2(String colour, double width, double length){      // constructor
        // this.class fields = variables from outside
        this.colour = colour;
        this.width = width;
        this.length = length;
    }

    public double calculatePerimeter( ){
        return (2*(length+width));
    }

    public double calculateArea( ){
        return (width*length);
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public String getColour( ){
        return colour;
    }
}
