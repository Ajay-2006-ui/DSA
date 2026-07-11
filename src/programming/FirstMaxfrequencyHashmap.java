package programming;

import java.util.HashMap;

public class FirstMaxfrequencyHashmap {
    public static void main(String[] args) {
        String str = "aabbcc";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        int MaxCount = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > MaxCount) {
                MaxCount = map.get(key);
            }
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.get(ch) ==MaxCount){
                System.out.println(ch + "=" + MaxCount);
                break;
            }
        }
    }
}
