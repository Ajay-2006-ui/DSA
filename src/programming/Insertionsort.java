package programming;

public class Insertionsort {
    public static void insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key=arr[i];
            int j=i-1;
        while(j>=0&& arr[j]>key){
        arr[j+1]=arr[j];
        j--;
}

            arr[j+1]=key;
        }
    }
public static void main(String[]args){
    int []arr={29,34,9,4,100,25,1,65 ,200000000,3};
    insertionsort(arr);
    for(int num:arr){
        System.out.print(num+" ");
    }

}
}
