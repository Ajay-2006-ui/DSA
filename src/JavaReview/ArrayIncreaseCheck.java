package JavaReview;

public class ArrayIncreaseCheck {
     boolean IsIncreasing(int []arr){
         for(int i=0;i<arr.length-1;i++){
             if(arr[i]>arr[i+1]){
                 return false;
             }
         }
         return true;
    }
    public static void main(String []args){
        int [] arr={1,2,3,4,5,6,7,};
        int []num={1,2,3,4,5,3,4};
        ArrayIncreaseCheck At=new ArrayIncreaseCheck();
       System.out.println( At.IsIncreasing(arr));
        System.out.println(At.IsIncreasing(num));


    }
}
