package DSA;
import java.util.HashMap;

public class ConsecutiveLength {
    public static <Hashmap> void main(String[] args) {
        int []arr={10};
        int count=0;
        HashMap<Integer,Integer>st=new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            st.put(arr[i], i);
        }

        for(int i=0;i<arr.length;i++) {
            int need=arr[i]+1;
            if(st.containsKey(need)) {
                count++;
            }
        }
        System.out.println(count+1);

    }
}
