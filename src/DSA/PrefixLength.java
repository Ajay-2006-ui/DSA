package DSA;
public class PrefixLength {
    public static void main(String[] args) {

        String[] arr = {"interview", "internet", "internal", "interval"};

        int count = 0;

        for(int i = 0; i < arr[0].length(); i++) {

            boolean same = true;

            for(int j = 1; j < arr.length; j++) {

                // Check string length first
                if(i >= arr[j].length()) {
                    same = false;
                    break;
                }

                // Compare characters
                if(arr[j].charAt(i) != arr[0].charAt(i)) {
                    same = false;
                    break;
                }
            }

            // If all matched
            if(same) {
                count++;
            }
            else {
                break;
            }
        }

        System.out.println(count);
        for(int m=0; m<count; m++){
            System.out.print(arr[0].charAt(m));
        }

        // Remaining part you write:
        // print the common prefix using count
    }
}