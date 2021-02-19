class C {
    public C ( ) { System.out.println("Class C no argument constructor.");  }
    public C (int arg) { System.out.println("Class C with " + arg + " passed to class A constructor.");   }
}

class D extends C {
    public D ( ) { System.out.println("Class D no argument subclass constructor.");  }
    public D (int arg) {
//        super(arg);
        System.out.println("Class D subclass constructor with " + arg + " as the parameter.");
    }
}

public class DemoChain2 {
    public static void main (String [] args) {
        D obj1 = new D( );
        System.out.println(">Back in main<");
        D obj2 = new D(5);
    }
}

//        Output :
//        Class C no argument constructor.
//        Class D no argument subclass constructor.
//        >Back in main<
//        Class C no argument constructor.
//        Class D subclass constructor with 5 as the parameter.