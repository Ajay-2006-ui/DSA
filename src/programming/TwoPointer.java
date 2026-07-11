package programming;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 7};
        int target = 9;
        int left = 0;
        int right = arr.length - 1;

        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Found at indices: " + left + ", " + right);
                found = true;
                break;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }

        if (!found) {
            System.out.println("No pair found");
        }

    }
}