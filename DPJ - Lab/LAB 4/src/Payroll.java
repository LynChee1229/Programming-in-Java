// class definition for Payroll
public class Payroll {

    // private fields/data
    private String name, ID;
    private double payRate;
    private int hoursWork;

    // no-argument constructor
    public Payroll( ){ }

    // constructor that accept arguments name and ID
    public Payroll(String name, String ID){
        this.name = name;
        this.ID = ID;
    }

    // mutators
    public void setName(String name) {  this.name = name;  }
    public void setID(String ID){  this.ID = ID;  }
    public void setPayRate(double payRate){  this.payRate = payRate;  }
    public void setHoursWork(int hoursWork){  this.hoursWork = hoursWork;  }

    // accessors
    public String getName( ){  return name;  }
    public String getID( ){  return ID;  }
    public double getPayRate( ){  return payRate;  }
    public int getHoursWork( ){  return hoursWork;  }

    // public method
    public double getGrossPay( ){  return (hoursWork*payRate);  }
}
