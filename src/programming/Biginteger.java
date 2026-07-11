package programming;

import java.math.BigInteger;
import java.util.*;
public class Biginteger {
    public static void main(String[] args){
        BigInteger a =new BigInteger("2000000000000000000000");
        BigInteger b=new BigInteger("3343433223323232334777878787554");
        BigInteger c=a.add(b);
        BigInteger d=new BigInteger(b+"");
        System.out.println(c);
        System.out.println(d);
        System.out.println(c.multiply(a));
        System.out.println(a.divide(b));
        BigInteger b2=new BigInteger("8765");
        int y= b2.intValue();
        long z=b2.longValue();
        System.out.println(y);
        System.out.println(z);


    }
}
