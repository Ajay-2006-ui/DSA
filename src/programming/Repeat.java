package programming;

import java.util.Scanner;
public class Repeat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        int Count = 0;
        boolean isnegeative= false;

        if(n<0){
            isnegeative=true;

        }
        for(int i=0; i<str.length(); i++){
            Count++;
        }
        if(isnegeative){
            System.out.println("the count is:"+(-Count));
        }
        if(n>0) {
            System.out.println("the no of integers is:" + Count);
        }


    }
}
