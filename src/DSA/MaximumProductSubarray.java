package DSA;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -4};
        int MaxProduct = Integer.MIN_VALUE;
        int CurrentProduct = 1;

        for(int i = 0; i < arr.length; i++) {
            CurrentProduct *= arr[i];

            if(CurrentProduct > MaxProduct) {
                MaxProduct = CurrentProduct;
            }

        }

        System.out.println("Maximum Subarray Sum: " + MaxProduct);
    }
}

