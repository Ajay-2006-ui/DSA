package JavaReview;

public class RecursionNumber {
    boolean NumberPalindrome(int []num,int left,int right){
        if(left>=right){
            return true;
        }
        if(num[left]!=num[right]){
            return false;
        }
        return  NumberPalindrome(num,left+1,right-1);

    }
    public static void main(String []args){
        int num[]={1,2,3,4,5};
        int left=0,right=num.length-1;
        RecursionNumber obj=new RecursionNumber();
        System.out.println(obj.NumberPalindrome(num,left,right));
    }
}
