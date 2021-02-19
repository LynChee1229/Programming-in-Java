public class eg7_wrongExceptionParameter {
    public static void main(String [] args) {
        String text = "JAVA";
        try {
            for(int x=0; x<=4; x++) {
                System.out.println(text.charAt(x));     // StringIndexOutOfBounds
            }
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("\nError. The next element doesn't exist.");
        }
    }
}
