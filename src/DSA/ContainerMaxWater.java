package DSA;

public class ContainerMaxWater {
    public static void main(String[] args) {
        int []arr={1,8,6,2,5,4,8,3,7};
        int MaxWater=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int width=j-i;
                int height=Math.min(arr[i],arr[j]);
                int Water=height*width;
                MaxWater=Math.max(MaxWater,Water);

            }
        }
        System.out.println(MaxWater); 
    }

}
