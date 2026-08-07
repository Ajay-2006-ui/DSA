package programming;

import java.math.BigInteger;

import java.math.BigInteger;                 // Import BigInteger class

public class Biginteger {

    public static void main(String[] args) {

        BigInteger a = new BigInteger("2000000000000000000000"); // Create large integer

        BigInteger b = new BigInteger("3343433223323232334777878787554"); // Another large integer

        BigInteger c = a.add(b);             // Add two BigIntegers

        BigInteger d = new BigInteger(b + ""); // Create copy of b using String

        System.out.println(c);               // Print addition result

        System.out.println(d);               // Print copied value

        System.out.println(c.multiply(a));   // Multiply two BigIntegers

        System.out.println(a.divide(b));     // Divide a by b (Integer division)

        BigInteger b2 = new BigInteger("8765"); // Create another BigInteger

        int y = b2.intValue();               // Convert BigInteger to int

        long z = b2.longValue();             // Convert BigInteger to long

        System.out.println(y);               // Print int value

        System.out.println(z);               // Print long value
    }
}