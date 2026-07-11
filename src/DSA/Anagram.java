package DSA;

import java.util.Arrays;

public class Anagram {
    boolean anagram(String t, String s) {
            char []ch= t.toCharArray();
            Arrays.sort(ch);
            String t1 = new String(ch);
            char[] ch1= s.toCharArray();
            Arrays.sort(ch1);
            String s1= new String(ch1);

        if(t1.equals(s1)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String t="listen";
        String s= "siloooont";
        Anagram a= new Anagram();
       System.out.print(a.anagram(t,s));

    }

}
