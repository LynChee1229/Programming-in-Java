// class definition of BankAccount
public class BankAccount {

    // private field : holds account balance
    private double balance;

    // no-argument constructor, sets balance to 0.00
    public BankAccount( ){
        balance = 0.00; }

    // constructor with parameter 'startBalance', assign to account balance
    public BankAccount(double startBalance){
        balance = startBalance;     }

    // make deposit into account
    public void deposit(double amount){
        balance += amount;          }

    // withdraw from account
    public void withdraw(double amount){
        balance -= amount;          }

    // mutator : set account balance
    public void setBalance(double balance){
        this.balance = balance;     }

    // accessor : get account balance
    public double getBalance( ){
        return balance;             }
}
