package DSA;
import java.util.*;


public class Platform {
    public static void main(String[] args) {
        int[] arrival={1,3,5};
        int[] departure={2,6,8};

        Arrays.sort(arrival);
        Arrays.sort(departure);

         int n=arrival.length;

         int platforms=1;
         int Maxplatforms=1;

         int i=1;
         int j=-0;

                  while(i<n&&j<n){
                 if(arrival[i]<=departure[j]){
                     platforms++;
                     i++;
                 }
                 else if(arrival[i]>departure[j]){
                     platforms--;
                     j++;
                 }
                 Maxplatforms=Math.max(Maxplatforms,platforms);

         }
        System.out.println("The minimum platforms required is:" + Maxplatforms);

    }
}
