package programming;
import java.util.Scanner;
public class prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr={10,20,36,85,45,69,55};
        int n=arr.length;
        int []prefix=new int[n];
         prefix[0]=arr[0];
          for(int i=1;i<n;i++){
              prefix[i]=prefix[i-1]+arr[i];
          }
          System.out.println("enter the value of l");
          int l=sc.nextInt();
          System.out.println("enter the value of r");
          int r=sc.nextInt();

          int sum;
          if(l==0){
              sum=prefix[r];
          }
          else{
              sum=prefix[r]-prefix[l-1];
          }
        System.out.println("Sum from index " + l + " to " + r + " = " + sum);


    }
}
