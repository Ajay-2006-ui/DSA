package programming;
import java.util.Scanner;
 class See {
    public static int elige(int []arr) {
        int count = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                count++;

            }
        }
        return count;
    }
}
public class Even{
     public static void main(String []args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the array:");
         int n =sc.nextInt();
         int []arr=new int[n];
         System.out.println("Enter the array elements:");
         for(int i=0; i<n; i++){
             arr[i]=sc.nextInt();
         }
        System.out.println("The no of even numbers:"+See.elige(arr));

     }

}