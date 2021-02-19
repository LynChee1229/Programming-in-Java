class StarWars {
    public StarWars ( ) { System.out.println("A galaxy far far away. ");    }
    public StarWars(String x) {
        this();
        System.out.println(x + " is not Baby Yoda. ");  }
}

class Jedi extends StarWars {
    public Jedi ( ) {
        super();
        System.out.println("May the force be with you. ");  }
}

class Mando extends StarWars {
    public Mando ( ) { System.out.println("Our secrecy is our survival. ");     }
    public Mando (String y) {
        super(y);
        System.out.println("This is the way. ");    }
}

public class Epic {
    public static void main (String [] args) {
        Jedi obj1 = new Jedi( );
        Mando obj2 = new Mando("Gorgu");
    }
}

//        Output :
//        A galaxy far far away.
//        May the force be with you.
//        A galaxy far far away.
//        Gorgu is not Baby Yoda.
//        This is the way.