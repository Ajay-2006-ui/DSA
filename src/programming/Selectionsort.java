package programming;

public class Selectionsort {
    public static void selectionsort(int[] arr) {
        int n = arr.length ;
        for (int i = 0; i < n - 1; i++) {
            int minindex = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minindex]) {
                    minindex = j;
                }
            }

            if (arr[i] != arr[minindex]) {
                int temp = arr[i];
                arr[i] = arr[minindex];
                arr[minindex] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int []arr={29,34,9,4,100,25,1,65 ,200000000,3};
        selectionsort(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}


