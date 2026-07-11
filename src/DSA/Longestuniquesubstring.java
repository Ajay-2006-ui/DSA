package DSA;
import java.util.*;

public class Longestuniquesubstring {
    public static void main(String[] args) {
        String str = "bccdacbcbab";
        int left = 0;
        int startindex = 0;
        int maxlen = Integer.MIN_VALUE;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            while (set.contains(ch)) {
                set.remove(str.charAt(left));
                left++;

            }
            set.add(ch);
            int len = right - left + 1;

            if (len > maxlen) {
                maxlen = len;
                startindex = left;
            }
        }
            String uniq = str.substring(startindex, startindex + maxlen);

            System.out.println(maxlen);
            System.out.println(uniq);
        }
    }

