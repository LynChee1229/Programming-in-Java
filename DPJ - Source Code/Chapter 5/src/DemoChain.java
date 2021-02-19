class A {
    public A ( ) { System.out.println("Class A no argument constructor.");  }
    public A (int arg) { System.out.println("Class A with " + arg + " passed to class A constructor.");   }
}

class B extends A {
    public B ( ) { System.out.println("Class B no argument subclass constructor.");  }
    public B (int arg) {
        super(arg);
        System.out.println("Class B subclass constructor with " + arg + " as the parameter.");
    }
}

public class DemoChain {
    public static void main (String [] args ) {
        B obj1 = new B();
        System.out.println(">Back in main<");
        B obj2 = new B(5);
    }
}

//        Output :
//        Class A no argument constructor.
//        Class B no argument subclass constructor.
//        >Back in main<
//        Class A with 5 passed to class A constructor.
//        Class B subclass constructor with 5 as the parameter.