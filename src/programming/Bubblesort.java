package programming;

public class Bubblesort {

    public static void bubblesort(int[] arr) {        // Method to sort the array

        int n = arr.length;                           // Store array size

        for (int i = 0; i < n - 1; i++) {             // Outer loop for each pass

            boolean swap = false;                     // Assume no swapping in this pass

            for (int j = 0; j < n - 1 - i; j++) {     // Compare adjacent elements

                if (arr[j] > arr[j + 1]) {            // If elements are in wrong order

                    int temp = arr[j];                // Store current element

                    arr[j] = arr[j + 1];              // Move smaller element left

                    arr[j + 1] = temp;                // Move larger element right

                    swap = true;                      // A swap occurred in this pass
                }
            }

            if (!swap) {                              // If no swaps happened
                break;                                // Array is already sorted, stop early
            }
        }
    }

    public static void main(String[] args) {          // Program execution starts here

        int[] arr = {29, 34, 9, 4, 100, 25, 1, 65, 200000000, 3}; // Unsorted array

        bubblesort(arr);                              // Call Bubble Sort

        for (int num : arr) {                         // Traverse sorted array

            System.out.print(num + " ");              // Print each element
        }
    }
}