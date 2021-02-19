class Staff {
    private String SName, SID;
    private double salary;

    // default constructor (without parameter) :
    public Staff ( ) {
        SName = " ";
        SID = "000-000-0000";
        salary = 0.00;
    }
    // constructor with parameters :
    public Staff (String SName, String SID) {
        this.SName = SName;
        this.SID = SID;
        salary = 0.00;
    }
    // mutator :
    public void setName (String name) { SName = name; }
    public void setID (String ID) { SID = ID; }
    public void setSalary (double sal) { salary = sal; }
    // accessor :
    public String getName ( ) { return SName; }
    public String getID ( ) { return SID; }
    public double getSalary ( ) { return salary; }
}

class Executive extends Staff {
    public Executive (String name, String ID, double salary) {
        super(name,ID);
        super.setSalary(salary);
    }
}

class PartTimer extends Staff {
    private double rate, hours;

    public PartTimer (String name, String ID, double rate, double hours) {
        super(name,ID);
        this.rate = rate;
        this.hours = hours;
    }
    public double getSalary ( ) {
        double pay = hours*rate;
        return pay;
    }
}

class Salesperson extends Staff {
    private double sales, commRate;

    public Salesperson (String name, String ID, double sales, double commRate) {
        super(name,ID);
        this.sales = sales;
        this.commRate = commRate;
    }
    public double getSalary ( ) {
        double pay = super.getSalary() + (sales*commRate);
        return pay;
    }
}

public class Payroll {
    public static void main (String [] args) {
        // superclass reference
        Staff[] person = new Staff[3];
        person[0] = new Executive("Rey","112333",2500);
        person[1] = new PartTimer("Luke","234455",1.5,40);
        person[2] = new Salesperson("Kylo","771133",5000,0.1);
        person[2].setSalary(1000);

        for(int i=0; i<3; i++){
            displayInfo(person[i]);     // passing each element to the displayInfo method.
        }
    }

    public static void displayInfo(Staff z) {
        System.out.println("\nName        : " + z.getName());
        System.out.println("Staff ID    : " + z.getID());
        System.out.println("Salary      : RM " + String.format("%.2f",z.getSalary()));
    }
}

//        Output :
//        Name        : Rey
//        Staff ID    : 112333
//        Salary      : RM 2500.00
//
//        Name        : Luke
//        Staff ID    : 234455
//        Salary      : RM 60.00
//
//        Name        : Kylo
//        Staff ID    : 771133
//        Salary      : RM 1500.00