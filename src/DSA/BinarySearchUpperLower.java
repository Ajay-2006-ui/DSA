package DSA;
public class BinarySearchUpperLower {
    int lowerbound(int[] arr, int key ){
        int left = 0;
        int right = arr.length;
        int ans=arr.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= key) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }


    int upperbound(int[] arr, int key){
        int left = 0;
        int right = arr.length;
        int ans=arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >key) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
    }


class Bin{
    public static  void  main(String[] args){
        int[] arr = {1,2,4,4,4,4,7};
        BinarySearchUpperLower bs = new BinarySearchUpperLower();
        System.out.println(bs.lowerbound(arr,4));
        System.out.println(bs.upperbound(arr,4));
        int Frequency=bs.upperbound(arr,4)-bs.lowerbound(arr,4);
        System.out.println(Frequency);
    }
}
