package DSA;
import java.util.*;
public class ExtraCharacter {
    StringBuilder ExtraAlphaBet(String s1,String s2){
        StringBuilder sb=new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
        if(!set.contains(s2.charAt(i))) {
            sb.append(" "+s2.charAt(i));
        }
        }

        return sb;
    }
    public static void main(String[] args) {
        String s1="aabb";
        String s2="ababc";
        ExtraCharacter a=new ExtraCharacter();
        System.out.println(a.ExtraAlphaBet(s1,s2));
    }

}
