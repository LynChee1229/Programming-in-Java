// == operator : compare reference/address
// .equal() method : compare content
// .equalsIgnoreCase() method : compare content ignore case
// .compareTo() method : compare values lexicographically

public class Chapter1_8_StringClass {
    public static void main(String [] args){
        String s1 = "Hello";                        // String literal
        String s2 = "Hello";                        // String literal
        String s3 = s1;                             // same reference
        String s4 = new String("Hello");     // String object
        String s5 = new String("Hello");     // String object
        String s6 = "HELLO";                        // String literal

//        s1 == s1;                     --- True, same pointer
//        s1 == s2;                     --- True, s1 & s2 share same storage in common pool
//        s1 == s3;                     --- True, s3 assigned same pointer as s1
//        s1.equals(s3);                --- True, same contents
//        s1 == s4;                     --- FALSE, different pointers (s1 is string class; s4 is string object)
//        s1.equals(s4);                --- True, same content
//        s4 == s5;                     --- FALSE, different pointers (objects with same values do not share memory location)
//        s4.equals(s5);                --- True, same content
//        s1 == s6;                     --- FALSE, different content
//        s1.equalsIgnoreCase(s6);      --- True, same contents if ignore case

        System.out.println(s1 == s1);
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
        System.out.println(s1 == s6);
        System.out.println(s1.equalsIgnoreCase(s6));
        System.out.println(s1.compareTo(s6));       // return integer based on unicode
    }
}
