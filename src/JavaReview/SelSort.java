package JavaReview;

public class SelSort {
    void selectionsort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                }
                if (arr[i] != arr[min]) {
                    int temp = arr[i];
                    arr[i] = arr[min];
                    arr[min] = temp;
                }
            }
    }
    public static void main(String[] args) {
        int []arr={23,45,43,12,8,67,34,889,345,};
        SelSort s=new SelSort();
        s.selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
