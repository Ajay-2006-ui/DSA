package DSA;
import java.util.*;

public class ContainsDuplicate {
    boolean DuplicateCheck(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                return true;
            }
            map.put(arr[i],1);

        }
        return false;

    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,};
        ContainsDuplicate dc = new ContainsDuplicate();
        System.out.println(dc.DuplicateCheck(arr));

    }
}
