// this whole statements is the CLASS DEFINITION for Rectangle

public class Rectangle {
    private double width;
    private double length;

    public Rectangle( ){                        // constructor without argument

    }

    public Rectangle(double len, double w){     // constructor with arguments
        length = len;
        width = w;
    }

    public void setLength(double len){          // mutator
        length = len;
    }

    public void setWidth(double w){             // mutator
        width = w;
    }

    public double getLength( ){                 // accessor
        return length;
    }

    public double getWidth( ){                  // accessor
        return width;
    }

    public double getArea( ){
        return (length*width);
    }
}
