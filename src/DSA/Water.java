package DSA;
public class Water {
    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,7};

        int left = 0;
        int right = arr.length - 1;

        int maxWater = 0;

        while (left < right) {

            int height = Math.min(arr[left], arr[right]);

            int width = right - left;

            int water = height * width;

            maxWater = Math.max(maxWater, water);

            // Move smaller height pointer
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxWater);
    }
}