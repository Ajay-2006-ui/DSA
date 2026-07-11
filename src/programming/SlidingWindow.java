package programming;

public class SlidingWindow {
    public static void main(String[] args) {
        int []arr = {1, 4, 2, 10, 2, 3, 1};
        int k = 4;

        int windowSum = 0;

// Step 1: first window
        for(int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

// Step 2: slide window
        for(int i = k; i < arr.length; i++) {

            windowSum += arr[i];       // add next element
            windowSum -= arr[i - k];   // remove left element

            if(windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println(maxSum);

    }
}
