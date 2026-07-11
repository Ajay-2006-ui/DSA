package programming;
import java.util.Scanner;
public class Missingnumber {
    public static int missingnumber(int[] arr) {
        int n= arr.length+1;
        int sum = 0;
        for (int num : arr) {
            sum+=num;
        }
        int totalsum =n*(n+1)/2;
        return totalsum-sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.print("Enter theb array numbers");
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
       System.out.print( missingnumber(arr));
    }
}

