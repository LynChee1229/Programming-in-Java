//Lab 6 e.g. 5: Numbers5.java

public class Numbers5
{
    public static void main (String [] arg) 
    {
        int [] arrayNo = {40,67,21,34};
        try{
            displayArray(arrayNo); //call method
            //change value
            arrayNo[0]= arrayNo[0]+arrayNo[1];                  // had been skipped
            System.out.println("First number is "+arrayNo[0]);  // had been skipped
        }
                   
        catch(IndexOutOfBoundsException e)
        {
            System.out.println("Could not print the array of the index.");
            System.out.println(e);
        }
	 
        finally {
            System.out.println("\nThank you.");
        }
    }
    
    public static void displayArray(int [] list)
    {
        System.out.println("\nThe list of numbers:");
        try
        {
            for(int i=0;i<=4; i++)
                System.out.println(list[i]);         
        }
        catch(NullPointerException e) //not a good example (not matching)
        {
            System.out.println("Catched!");
        }
     }
}

/*
     2) The exception type is ArrayIndexOutOfBoundsException.

     3) Because there is no matched method to handle the error in displayArray.

     4) No, the program skipped it and onwards.

     6) No, the output is different.

     7) Because the exception has been handle inside the displayArray method before it flow back to the MAIN
        (so there is no exception inside main).

     Conclusion5: main; terminate/stop; continue/run
 */