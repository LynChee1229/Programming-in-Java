// CHAN LIN CHEE 1191202546
// TT6V
// Lab 5B - Question 3

import java.util.Scanner;

class Employee {
    private String employeeID, employeeName;

    public Employee (String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }
    public String getID ( ) { return employeeID; }
    public String getName ( ) { return employeeName; }
}

class FactoryWorker extends Employee {
    private int[] monthsOTHours;

    public FactoryWorker (String ID, String name, int[] OTHours) {
        super(ID,name);
        monthsOTHours = OTHours;
    }
    public int[] getMonthsOTHours() { return monthsOTHours; }
}

class Supervisor extends FactoryWorker {
    private double avgOT, bonus;

    public Supervisor (String ID, String name, int[] svOTHours) {
        super(ID,name,svOTHours);
    }
    public double getAvgOT ( ) {
        int[] OT = getMonthsOTHours();
        int total = 0;
        for(int i=0; i<OT.length; i++) {
            total += OT[i];
        }
        avgOT = (double)total/OT.length;
        return avgOT;
    }
    public double getAnnualBonus ( ) {
        bonus = getAvgOT()>=30 ? 800 :
                getAvgOT()>=20 ? 500 :
                getAvgOT()>=10 ? 200 :
                0;
        return bonus;
    }
}

public class Lab5bQ3 {
    public static void main (String [] args) {
        Scanner get = new Scanner(System.in);

        System.out.println("[ Supervisor Information ]");
        System.out.print("Enter employee ID     : ");
        String ID = get.nextLine();
        System.out.print("Enter employee name   : ");
        String name = get.nextLine();

        int[] OT = new int[12];
        System.out.println("Enter overtime (hours) for the year : ");
        for(int x=0; x<OT.length; x++) {
            System.out.print("Month " + (x+1) + " = ");
            OT[x] = get.nextInt();
        }

        Supervisor obj = new Supervisor(ID,name,OT);

        System.out.println("\n[ Annual Report ]");
        System.out.println("Supervisor ID     : " + obj.getID());
        System.out.println("Supervisor Name   : " + obj.getName());
        System.out.printf("\nAverage OT        : %.2f" , obj.getAvgOT());
        System.out.printf("\nAnnual bonus      : $%.2f\n" , obj.getAnnualBonus());
     }
}
