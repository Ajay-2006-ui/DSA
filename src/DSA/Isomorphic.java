package DSA;


import java.util.HashMap;

public class Isomorphic {

    boolean isomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // If mapping already exists
            if (map.containsKey(ch1)) {

                if (map.get(ch1) != ch2) {
                    return false;
                }

            }

            // If mapping doesn't exist
            else {

                // Prevent two characters mapping to same character
                if (map.containsValue(ch2)) {
                    return false;
                }

                map.put(ch1, ch2);
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "paper";
        String t = "title";

        Isomorphic obj = new Isomorphic();

        System.out.println(obj.isomorphic(s, t));
    }
}