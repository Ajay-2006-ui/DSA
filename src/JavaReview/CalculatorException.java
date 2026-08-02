package JavaReview;

public class CalculatorException {
    void divide(int a ,int b){
        if(b<0){
            throw new IllegalArgumentException("Negative denominator is not allowed.");
        }
        else {
            int ans = a / b;
            System.out.println(ans);
        }
    }
    public  static void main(String[] args) {
        CalculatorException c=new CalculatorException();
        c.divide(10,0);
    }
}