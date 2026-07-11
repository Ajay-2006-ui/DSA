package JavaReview;

public class MinSort{
    void selectionsort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
                int temp =arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }

        }
    }


class SELECTIONSORT{
    public static void main(String[] args) {
        int []arr={5,2,7,1,6,3,9};
        MinSort obj=new MinSort();
        obj.selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
