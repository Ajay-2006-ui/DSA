package programming;

public class BruteForce {
        public static void main(String[] args) {

            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int n = arr.length;

            int maxSum = Integer.MIN_VALUE;

            for(int i = 0; i < n; i++) {              // starting index
                for(int j = i; j < n; j++) {          // ending index

                    int sum = 0;                      // reset sum for each subarray

                    for(int k = i; k <= j; k++) {     // calculate sum from i to j
                        sum += arr[k];
                    }

                    if(sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }

            System.out.println(maxSum);
        }
    }

