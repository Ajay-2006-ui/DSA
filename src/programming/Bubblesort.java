package programming;

public class Bubblesort {
    public static void bubblesort(int []arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={29,34,9,4,100,25,1,65 ,200000000,3};
        bubblesort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }

    }





}












