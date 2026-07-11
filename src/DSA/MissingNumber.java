package DSA;

public class MissingNumber {
    public static void main(String[] args) {
       int []arr= {3,0,1};
       int n= arr.length;
        int ActualSum=0;
        int ExpectedSum=n*(n+1)/2;
       for(int i=0;i<arr.length;i++){
           ActualSum+=arr[i];
       }
       int MissingNumber=ExpectedSum-ActualSum;
       System.out.println(MissingNumber);
    }
}
