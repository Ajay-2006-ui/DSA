public class BitManipulation {
    // Checks whether a number is Odd or Even
// Logic:
// Even numbers always have the last bit = 0
// Odd numbers always have the last bit = 1
// (n & 1) checks only the last bit
// If result is 0 -> Even
// If result is 1 -> Odd
    void OddorEven(int n) {
        if ((n & 1) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    // Checks whether a number is a Power of 2
// Logic:
// A power of 2 has exactly one set bit
// Example:
// 8  = 1000
// 7  = 0111
// 8 & 7 = 0000
// So, for every power of 2:
// (n & (n-1)) == 0
// n > 0 is added because 0 is not a power of 2
    void PowerOf2(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("power of 2");
        } else {
            System.out.println("not power of 2");
        }
    }
    // Checks whether the k-th bit is set (1) or not
// Logic:
// (1 << k) creates a mask with only the k-th bit as 1
// Example:
// k = 2
// Mask = 00000100
// n & mask
// If result is not 0 -> k-th bit is present (1)
// If result is 0 -> k-th bit is not present (0)
    void kthbit(int n, int k) {
        if ((n & (1 << k)) != 0) {
            System.out.println("kth bit is present");
        } else {
            System.out.println("kth bit is NOT present");
        }
    }

    // Counts the number of Set Bits (1's)
// Logic:
// Check the last bit using (n & 1)
// If last bit is 1 -> Increase count
// Right shift the number to check the next bit
// Repeat until the number becomes 0
// Time Complexity: O(Number of Bits)
    void CountBit(int n) {
        int count = 0;

        while (n > 0) {

            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        System.out.println("Set Bits : " + count);
    }
    // Counts the number of Set Bits using Brian Kernighan's Algorithm
//
// Logic:
// Every time we do:
//
// n = n & (n - 1);
//
// the rightmost (last) set bit (1) is removed.
//
// Example:
// n = 10
// Binary = 1010
//
// n-1 = 1001
//
//      1010
//   &  1001
//   --------
//      1000
//
// The last set bit is removed.
//
// Again:
//
// n = 1000
// n-1 = 0111
//
//      1000
//   &  0111
//   --------
//      0000
//
// Again, the last set bit is removed.
//
// We increase the count every time a set bit is removed.
// The loop stops when n becomes 0.
//
// Time Complexity:
// O(Number of Set Bits)
// (Faster than checking every bit)
    void BitCouunt(int n) {

        int bits = 0;

        while (n > 0) {

            n = n & (n - 1);   // Removes the rightmost set bit

            bits++;
        }

        System.out.println("No of Set Bits : " + bits);
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
