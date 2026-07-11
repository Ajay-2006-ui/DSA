package JavaReview;
public class Recursion{
    void print(int n){
        if(n==0)
            return;
        print(n-1);
        System.out.println(n);
    }
}
class Review{
public static void main(String args[]){
    Recursion r = new Recursion();
    r.print(5);

}
}
