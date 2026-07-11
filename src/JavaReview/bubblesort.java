package JavaReview;

class Jumpsort {
    void sort(int[] arr) {
        int n=arr.length;
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
}
public class bubblesort{
    public static void main(String[] args) {
        int arr[]={4,7,6,8,3,9,23};
        Jumpsort s=new Jumpsort();
        s.sort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
