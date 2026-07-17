package JavaReview;

public class BankAccount {
    private String accountHolder;
    private double balance;
    BankAccount(String accountHolder){
        this.accountHolder = accountHolder;
    }
    void deposit(double amount){
        if (amount > 0){
            this.balance += amount;
        }

        }
        double getBalance(){
        return this.balance;
    }
    void display(){
        System.out.println(accountHolder);
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccount b= new BankAccount("Ajay");
        b.deposit(50000);
        b.deposit(-1000);
        b.display();
    }
}
