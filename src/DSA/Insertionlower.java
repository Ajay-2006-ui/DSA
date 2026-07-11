package DSA;

public class Insertionlower {
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
    public static void main(String[] args) {
        int arr[]={2,3,5,6,7,8,9,10,11,12,13};
        int n=arr.length;
        int target=4;
        Insertionlower is=new Insertionlower();
        int pos=is.lowerbound(arr,target);
        int [] arr2=new int[arr.length+1];
        for(int i=0;i<pos;i++){
            arr2[i]=arr[i];
        }
        arr2[pos]=target;
        for(int i=pos;i<arr.length;i++){
            arr2[i+1]=arr[i];
        }
        for (int num:arr2){
            System.out.print(num+" ");
        }


    }
}
