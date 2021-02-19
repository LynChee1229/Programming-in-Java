//Lab 6 e.g. 4: Numbers4.java
// FINALLY block

// runtime error no need import
public class Numbers4
{
    public static void main (String [] arg) 
    {
        String code="";
	try
        {
            code = "A55123";
            int codenum = Integer.parseInt(code);   // error is thrown
            System.out.println("\nCode number is "+codenum);
        }
                   
        catch(IllegalArgumentException e)
        {
            System.out.println("\n" + code + " cannot convert to integer number.");
            System.out.println(e);
        }
	 
        finally {  
            System.out.println("\nFinally block - always run.");
        }
    }
}
/*
     2) NumberFormatException (IllegalArgumentException)

     3) Because the NumberFormatException is the subclass of 'IllegalArgumentException'

     4) Yes

     6) Yes

     7) Because the RunTimeException is the main class that can handle all the exception handling errors

     8) Yes

     11) No, there is no error thrown

     12) Yes, compiler will always run the finally block

     Conclusion4: finally; superclass
 */