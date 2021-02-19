import java.util.Scanner;

public class Chapter1_5{
    public static void main(String [] args){
        String name;
        int age;
        Scanner get = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = get.nextLine();

        System.out.print("\nHello " + name + ".\n"
        + "How old are you? >> ");
        age = get.nextInt();

        System.out.println("\n" + name + " is " + age + " y/o.");
    }
}
