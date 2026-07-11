package JavaReview;

public class CountGreaterThan {
    int couuntgreater(int []arr,int num){
        int count=0;
        for (int digit:arr){
            if (digit>num){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr={10,20,30,40,34,19,16};
        int num=30;
        CountGreaterThan cg=new CountGreaterThan();
       System.out.print( cg.couuntgreater(arr,num));


    }
}
