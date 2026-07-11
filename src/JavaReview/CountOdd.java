package JavaReview;
public class CountOdd {

    int countOdd(int[] arr, int index) {

        // Base case
        if (index == arr.length) {
            return 0;
        }

        // Current element is odd
        if (arr[index] % 2 != 0) {
            return 1 + countOdd(arr, index + 1);
        }

        // Current element is even
        return countOdd(arr, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        CountOdd obj = new CountOdd();

        System.out.println(obj.countOdd(arr, 0));
    }
}