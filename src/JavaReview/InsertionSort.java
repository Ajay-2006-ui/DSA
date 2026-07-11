package JavaReview;

public class InsertionSort {
    void INsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
    }
}
class Insort{
    public static void main(String[] args) {
        int []arr={5,9,2,6,4,89,6,45,67,23,12,};
        InsertionSort s=new InsertionSort();
        s.INsertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}