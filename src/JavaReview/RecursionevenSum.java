package JavaReview;

public class RecursionevenSum {

    int  evenSum(int []arr, int index,int sum){
        if(index==arr.length){
            return sum;
        }
        if (arr[index]%2==0) {
            sum+=arr[index];

        }
        return evenSum(arr,index+1,sum);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        RecursionevenSum obj=new RecursionevenSum();
        System.out.println(obj.evenSum(arr,0,0));
    }

}
