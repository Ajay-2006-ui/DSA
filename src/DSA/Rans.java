package DSA;
import java.util.HashMap;

public class Rans {

    boolean Magz(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count magazine characters
        for (int i = 0; i < magazine.length(); i++) {

            char c = magazine.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Check ransomNote characters
        for (int i = 0; i < ransomNote.length(); i++) {

            char c = ransomNote.charAt(i);

            // Character not available
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            }

            // Use one occurrence
            map.put(c, map.get(c) - 1);
        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        Rans r = new Rans();

        System.out.println(r.Magz(ransomNote, magazine));
    }
}