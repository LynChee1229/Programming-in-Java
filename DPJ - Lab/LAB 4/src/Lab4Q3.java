// CHAN LIN CHEE 1191202546
// TT6V
// Lab 4 - Question 3

import java.util.Scanner;

// class definition of Contestant
class Contestant {

    // private data fields
    private String name;
    private int age;
    private double score;

    // public no-argument constructor that sets default values
    public Contestant( ){
        name = "Doe";
        age = 1;
        score = 0.1;    }

    // public mutator methods
    public void setName(String name){  this.name = name;  }
    public void setAge(int age){  this.age = age;  }
    public void setScore(double score){  this.score = score;  }

    // public accessor methods
    public String getName( ){  return name;  }
    public int getAge( ){  return age;  }
    public double getScore( ){  return score;  }

    // public method that return group
    public String getGroup( ){
        String group = " ";
        if (age<15)
            group = "Alpha";
        else if (age>=15)
            group = "Beta";
        return group;
    }

    // public method that return status
    public String getStatus( ){
        String status=" ";
        if(getGroup().equals("Alpha") && score>=50 && score<=100
                || getGroup().equals("Beta") && score>=80 && score<=100){
            status = "Nominated";
        }
        else if(getGroup().equals("Alpha") && score>=0 && score<50
                || getGroup().equals("Beta") && score>=0 && score<80){
            status = "Eliminated";
        }
        return status;
    }
}


// main
public class Lab4Q3 {
    public static void main(String [] args){

        // prompt user to enter data
        System.out.print("Enter Name    : ");
        String name = new Scanner(System.in).nextLine();
        System.out.print("Enter Age     : ");
        int age = new Scanner(System.in).nextInt();
        System.out.print("Enter Score   : ");
        double score  = new Scanner(System.in).nextDouble();

        // create an object of Contestant
        Contestant object = new Contestant();

        // set those values into array fields
        object.setName(name);
        object.setAge(age);
        object.setScore(score);

        // display all data
        System.out.println("\nResult:");
        System.out.println("Contestant  : " + object.getName());
        System.out.println("Age         : " + object.getAge());
        System.out.println("Group       : " + object.getGroup());
        System.out.println("Score       : " + object.getScore());
        System.out.println("Status      : " + object.getStatus());
    }
}
