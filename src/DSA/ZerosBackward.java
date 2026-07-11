package DSA;

public class ZerosBackward {
    public static void main(String[] args) {
        int arr[]={1,0,3,0,12};
        int j=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }

        }
        while(j<arr.length){
            arr[j]=0;
            j++;
        }
        for(int m=0;m<arr.length;m++){
            System.out.print(arr[m]+" ");
        }

    }

    }

