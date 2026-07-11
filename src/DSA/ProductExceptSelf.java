package DSA;
public class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int product = 1;

            for (int j = 0; j < arr.length; j++) {

                if (i != j) {
                    product *= arr[j];
                }
            }

            ans[i] = product;
        }

        // Print answer
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}