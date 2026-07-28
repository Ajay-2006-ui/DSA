package JavaReview;

public interface Payments {
    void pay(double amount);

}
class CreditCard implements Payments {
    @Override
    public void pay(double amount) {
        System.out.println(amount +"paid using credit card " );

    }
    void transaction(){
        System.out.println("Transaction successful");
    }
    public static void main(String[] args) {
        Payments p= new CreditCard();
        p.pay(5000);
        CreditCard cc = new CreditCard();
        cc.transaction();
    }
}
