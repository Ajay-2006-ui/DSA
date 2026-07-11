package programming;
import java.util.Scanner;
public class Arraysort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean sort = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.print("Array is not sorted:");
                sort = false;
                break;
            }

        }
        if (sort) {
            System.out.println("Array is sorted");
        }
    }
}

