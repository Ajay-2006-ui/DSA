package DSA;

public class ReverseString {
    void RevString(char[]arr,int left,int right){
        if(left>=right){
            return ;
        }
         char temp=arr[left];
         arr[left]=arr[right];
         arr[right]=temp;
         RevString(arr,left+1,right-1);

    }
    public static void main(String[] args) {
        String s="hello";
        char[] arr=s.toCharArray();
        ReverseString r=new ReverseString();
        r.RevString(arr,0,arr.length-1);
        String result=new String(arr);
        System.out.println(result);
    }

}
