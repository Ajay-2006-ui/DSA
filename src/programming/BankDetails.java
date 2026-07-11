package programming;

public class BankDetails {
    private String accountHolderName;
    private long accountNumber;
    private double balance;

    BankDetails(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
     double Deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depositing " + amount + " into account " + accountNumber);
            return balance;
        }
        else{
            System.out.println("Insufficient funds to Deposit");
            return balance;
        }
    }
    double Withdraw(double amount) {
        if ( amount>0 && amount <= balance) {
            balance -=amount;
            System.out.println("The amount has sucesfully withdrawn");
            return balance;
        }
        else{
            System.out.println("Insufficient funds to Withdraw");
            return balance;
        }

    }
    void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}
class Bank{
    public static void main(String[] args) {
        BankDetails sbi = new BankDetails("Ajay",1101950812,7000);
        System.out.println(sbi.Deposit(50000));
        System.out.println(sbi.Withdraw(8000));
        sbi.displayAccountDetails();
    }
}
