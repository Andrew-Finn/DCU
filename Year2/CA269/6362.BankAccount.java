public class BankAccount{
    Double balance;
    public BankAccount(Double b){
        balance = b;
    }
    public void withdraw(Double n){
        balance -= n;
    }
    public void deposit(Double n){
        balance += n;
    }
}