// printf in Java

public class Chapter1_7_printf {
    public static void main(String [] args){
        System.out.printf("%S\n","java is fun!");       // uppercase string
        System.out.printf("%10s.\n","output");          // min length
        System.out.printf("%-10s.\n","output");         // left justify & min length
        System.out.printf("%c %C\n",'n','n');           // uppercase char
        System.out.printf("%.3f\n",3.1415926);          // 3 decimal places
        System.out.printf("%2.3f\n",3141.5926535);      // 3 decimal places, ignore the '2.'
    }
}
