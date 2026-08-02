package JavaReview;

public class CalculatorCatchThrowException {
    void divide(int a,int b){

        try{

            if(b<0){
                throw new IllegalArgumentException("Negative denominator is not allowed.");
            }

            int ans=a/b;
            System.out.println(ans);

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Calculator operation finished.");
        }
    }
    public static void main(String[] args) {
        CalculatorCatchThrowException ec=new CalculatorCatchThrowException();
        ec.divide(10,0);
    }
}


