package programming;

public class VarWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};

        int k = 4;
        int left = 0;
        int maxlen = 0;
        int sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            int len = right-left+1;
            if(len>maxlen){
                maxlen = len;
            }
        }
        System.out.println(maxlen);
    }
}
