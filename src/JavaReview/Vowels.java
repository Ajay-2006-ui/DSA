package JavaReview;

public class Vowels {

    int CountVowels(String s, int index, int count) { // Recursive method to count vowels

        String vowels = "aeiouAEIOU";                 // String containing all vowels

        if (index == s.length()) {                    // Base case: reached end of string
            return count;                             // Return total vowel count
        }

        char ch = s.charAt(index);                    // Get current character

        if (vowels.indexOf(ch) != -1) {               // Check if character is a vowel
            count++;                                  // Increment vowel count
        }

        return CountVowels(s, index + 1, count);      // Recur for next character
    }

    public static void main(String[] args) {          // Program execution starts here

        String s = "Education";                       // Input string

        Vowels Vt = new Vowels();                     // Create object of Vowels class

        System.out.print(Vt.CountVowels(s, 0, 0));    // Call method and print result
    }
}