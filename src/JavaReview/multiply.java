package JavaReview;

import java.util.Scanner;

public class multiply {
    int fact(int n){
        if(n==1||n==0)
            return 1;
        return n*fact(n-1);
    }
}
class factorial{
    public static void  main(String args[]){
        multiply m = new multiply();
        System.out.println(m.fact(5));
    }
}
