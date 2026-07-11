package programming;

import java.util.Scanner;

public class remove {
    public static String solve(String A, int b) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < A.length()) {
            char current = A.charAt(i);
            int count = 0;
            while (i < A.length() && A.charAt(i) == current) {
                count++;
                i++;
            }
            if (count != b) {
                for (int j = 0; j < count; j++) {
                    result.append(current);

                }
            }


        }
        return result.toString();
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the string");
      String A= sc.nextLine();
      System.out.println("enter the length of the b");
      int b= sc.nextInt();
      String answer=solve(A,b);
      System.out.println("result:"+ answer);
      sc.close();
    }
}


