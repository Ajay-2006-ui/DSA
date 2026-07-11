package JavaReview;
public class RecursionMax {

    int findmax(int[] arr, int index) {

        // base case
        if(index == arr.length - 1){
            return arr[index];
        }

        // recursive call
        int maxFromRest = findmax(arr, index + 1);

        // compare current with remaining max
        return Math.max(arr[index], maxFromRest);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        RecursionMax obj = new RecursionMax();

        System.out.println(obj.findmax(arr,0));
    }
}
