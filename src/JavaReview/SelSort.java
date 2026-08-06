package JavaReview;

public class SelSort {

    void selectionsort(int[] arr) {                  // Method to sort the array

        int n = arr.length;                          // Store array size

        for (int i = 0; i < n - 1; i++) {            // Traverse each position

            int min = i;                             // Assume current index has minimum element

            for (int j = i + 1; j < n; j++) {        // Search for smallest element in remaining array

                if (arr[j] < arr[min]) {             // Found a smaller element?
                    min = j;                         // Update minimum index
                }
            }

            if (arr[i] != arr[min]) {                // Swap only if needed

                int temp = arr[i];                   // Store current element

                arr[i] = arr[min];                   // Place smallest element at current position

                arr[min] = temp;                     // Put old element in minimum's position
            }
        }
    }

    public static void main(String[] args) {         // Program execution starts here

        int[] arr = {23, 45, 43, 12, 8, 67, 34, 889, 345}; // Unsorted array

        SelSort s = new SelSort();                   // Create object

        s.selectionsort(arr);                        // Call sorting method

        for (int i = 0; i < arr.length; i++) {       // Traverse sorted array

            System.out.print(arr[i] + " ");          // Print each element
        }
    }
}