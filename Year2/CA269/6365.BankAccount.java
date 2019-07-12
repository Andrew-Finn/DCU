public class BankAccount{
    double balance;
    public BankAccount(){
        balance = 100.0;
    }
    public BankAccount(int b){
        double bal=b;  
        balance = bal;
    }
    public void withdraw(double n){
        balance -= n;
    }
    public void deposit(double n){
        balance += n;
    }
    public String toString(){
        return "The balance is " + balance;
    }
    public void setBalance(double newValue){
        balance = newValue;
    }
    public double getBalance(){
        return balance;
    }
}