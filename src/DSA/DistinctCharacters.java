package DSA;

import java.util.HashMap;

public class DistinctCharacters {
    public static void main(String[] args) {

        String s="eceba";
        int k=2;
        int left=0;
        int maxlen=Integer.MIN_VALUE;

        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0;right<s.length();right++) {
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftch = s.charAt(left);
                map.put(leftch, map.get(leftch) - 1);

                if (map.get(leftch)==0){
                    map.remove(leftch);
                }
                left++;
            }
            int len=right-left+1;
            maxlen=Math.max(maxlen,len);}
           System.out.println(maxlen);

    }
}
