import java.util.Scanner;

public class TestPayroll {
    public static void main(String [] args){
        Scanner get = new Scanner(System.in);

        System.out.print("Enter employee name    : ");
        String name = get.nextLine();
        System.out.print("Enter employee ID      : ");
        String ID = get.next();
        System.out.print("Enter the pay rate     : $ ");
        double payRate = get.nextDouble();
        System.out.print("Enter the hours worked : ");
        int hoursWork = get.nextInt();

        Payroll prObj = new Payroll( );
        prObj.setName(name);
        prObj.setID(ID);
        // method 2 ---> Payroll prObj = new Payroll(name,ID);

        prObj.setPayRate(payRate);
        prObj.setHoursWork(hoursWork);

        System.out.println("-------------------------------------------");
        System.out.println("Employee Name       : "+prObj.getName());
        System.out.println("Employee ID         : "+prObj.getID());
        System.out.println("Pay Rate            : $ "+String.format("%.2f",prObj.getPayRate()));
        System.out.println("Hours Worked        : "+prObj.getHoursWork());
        System.out.println("Gross Pay (a week)  : $ "+String.format("%.2f",prObj.getGrossPay()));
    }
}
