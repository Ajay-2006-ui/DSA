package DSA;
import java.util.*;

public class UniqueCharacter {
    public static void main(String[] args) {
        String st="Leetcode";
        HashMap<Character,Integer> ch=new HashMap<>();
        for(int i=0;i<st.length();i++){
            Character m=st.charAt(i);
            if(ch.containsKey(m)){
                ch.put(m,ch.get(m)+1);
            }
            else{
                ch.put(m,1);
            }
        }
        for(int i=0;i<st.length();i++){
            Character m=st.charAt(i);
            if(ch.get(m)==1){
                System.out.println(i);
            }
        }


    }
}
