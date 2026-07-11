package DSA;


public class SumN {
        int sumn(int n) {
            if (n == 0) {
                return 0;
            }
            int sum=0;
            sum += n % 10;
            sumn(n/10);
            return sum;
        }
        public static void main(String args[]){
            SumN s = new SumN();
            System.out.println(s.sumn(1234));
        }
}
