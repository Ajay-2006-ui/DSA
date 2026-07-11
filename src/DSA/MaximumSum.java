package DSA;

public class MaximumSum {
    public static void main(String[] args) {
        int[] arr = {3, -2, 5, -1};
        int currentsum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currentsum += arr[i];

            if (currentsum>max) {
                max = currentsum;
            }
            if (currentsum < 0) {
                currentsum=0;
            }
        }
        System.out.println(max);
    }
}
