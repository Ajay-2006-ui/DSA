package programming;

import java.util.Scanner;

    public class Big {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int[] num = new int[n];
            System.out.println("enter the elements");
            for (int i = 0; i < n; i++) {
                num[i] = sc.nextInt();
            }
            int large =  Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                large = Math.max(large, num[i]);
            }
            System.out.println(large);

            int secondlarge = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (num[i] < large && num[i] >= secondlarge) {
                    secondlarge = num[i];
                }
            }
            System.out.println("The Secondlarge is:" + secondlarge);
        }
    }


