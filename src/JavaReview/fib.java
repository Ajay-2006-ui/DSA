package JavaReview;

public class fib {
    int fibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibo(n - 1)+fibo(n-2);
    }
}
class fibonacci {
    public static void main(String[] args) {
        fib s = new fib();
        System.out.println(s.fibo(10));
    }
}