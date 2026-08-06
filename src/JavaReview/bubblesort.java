package JavaReview;

class Jumpsort {

    void sort(int[] arr) {                 // Method to sort the array
        int n = arr.length;                // Store the size of the array

        for (int i = 0; i < n - 1; i++) {  // Outer loop for number of passes

            for (int j = 0; j < n - i - 1; j++) { // Compare adjacent elements

                if (arr[j] > arr[j + 1]) { // Check if elements are in wrong order

                    int temp = arr[j];     // Store current element temporarily
                    arr[j] = arr[j + 1];   // Move next element to current position
                    arr[j + 1] = temp;     // Place stored element in next position
                }
            }
        }
    }
}

public class bubblesort {

    public static void main(String[] args) {   // Program execution starts here

        int arr[] = {4, 7, 6, 8, 3, 9, 23};    // Create an unsorted array

        Jumpsort s = new Jumpsort();           // Create object of Jumpsort class

        s.sort(arr);                           // Call sorting method

        for (int i = 0; i < arr.length; i++) { // Traverse the sorted array
            System.out.print(arr[i] + " ");    // Print each element
        }
    }
}