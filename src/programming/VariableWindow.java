package programming;

public class VariableWindow {
        public static void main(String[] args) {

            int[] arr = {1, 2, 1, 0, 1, 1, 0};
            int k = 4;

            int left = 0;
            int sum = 0;
            int maxLen = 0;

            for (int right = 0; right < arr.length; right++) {

                sum += arr[right];

                while (sum > k) {
                    sum -= arr[left];
                    left++;
                }

                int len = right - left + 1;

                if (len > maxLen) {
                    maxLen = len;
                }
            }

            System.out.println(maxLen);
        }
    }

