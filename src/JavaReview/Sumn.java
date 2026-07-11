package JavaReview;

public class Sumn {
    int add(int n){
        if(n==0)
            return 0;
        return n + add(n-1);
    }
}
class Sumn2{
    public static void main(String[] args) {
        Sumn s = new Sumn();
        System.out.println(s.add(5));

    }
}

