package JavaReview;

public class InsertionSort {

    void INsertionSort(int[] arr) {               // Method to sort the array

        int n = arr.length;                       // Store array size

        for (int i = 1; i < n; i++) {             // Start from second element

            int key = arr[i];                     // Store current element to insert

            int j = i - 1;                        // Compare with previous elements

            while (j >= 0 && arr[j] > key) {      // Shift larger elements to the right

                arr[j + 1] = arr[j];              // Move element one position ahead

                j--;                              // Move to previous element
            }

            arr[j + 1] = key;                     // Insert key into correct position
        }
    }
}

class Insort {

    public static void main(String[] args) {      // Program execution starts here

        int[] arr = {5, 9, 2, 6, 4, 89, 6, 45, 67, 23, 12}; // Unsorted array

        InsertionSort s = new InsertionSort();    // Create object

        s.INsertionSort(arr);                     // Call sorting method

        for (int i = 0; i < arr.length; i++) {    // Traverse sorted array

            System.out.print(arr[i] + " ");       // Print each element
        }
    }
}