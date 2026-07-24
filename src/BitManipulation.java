public class BitManipulation {
    void OddorEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("even number"); // if a number is even then lastbit is 0 and if lastbit is 1 it is odd so when we
                                               // use & opertaor it checks last bit and if it is even the last bit will come 0 if not then for odd 1
        } else {
            System.out.println("odd number");
        }
    }

    void PowerOf2(int n) {
        if (n>0&&(n & (n - 1)) == 0) {
            System.out.println("power of 2");
        } else {
            System.out.println("not power of 2");
        }
    }

    void kthbit(int n, int k) {
        if ((n & (1 << k)) != 0) {
            System.out.println("kth bit is present ");
        }
        else  {
            System.out.println("kth bit is NOT present ");
        }
    }

    void CountBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;

        }
        System.out.println("Setbits is  :" + count);
    }
    void BitCouunt(int n){
        int bits=0;
        while(n>0) {
            n=n & (n-1);
            bits++;
        }
        System.out.println("no of Setbits : "+bits);
    }
    public static void main(String[] args) {
        BitManipulation bm = new BitManipulation();
        bm.OddorEven(4);
        bm.PowerOf2(5);
        bm.CountBit(10);
        bm.kthbit(10, 2);
        bm.BitCouunt(10);

    }

}
