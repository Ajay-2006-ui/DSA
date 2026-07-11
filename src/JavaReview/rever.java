package JavaReview;

public class rever {
    void reverse(int[] arr, int i, int j) {
        if(i>=j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i + 1, j - 1);

    }

}
class Exchange {
    public static void main(String[] args) {

        int[]arr=new int[]{1,2,3,4,5,6};

        System.out.println("The array before reverse");

        for(int num:arr){
            System.out.print(" "+num);
        }
        System.out.println();

        rever r = new rever();
        r.reverse(arr,0,arr.length-1);

        System.out.println("The array after reverse");
        for(int num:arr){
            System.out.print(" "+num);
        }


    }
}
