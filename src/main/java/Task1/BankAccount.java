package Task1;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setBalance(double balance) {
       this.balance = balance;
    }

    public double credit(double money) {
      balance = balance + money;
       return balance;
    }

    public double debit(double money) {
        if (money <= balance) {
         balance = balance - money;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Task1.BankAccount{" +
                "accountNumber:" + accountNumber + "balance:" + balance +
                '}';
    }
}
