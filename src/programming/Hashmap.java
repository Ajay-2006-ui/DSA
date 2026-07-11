package programming;
import java.util.*;

public class Hashmap {
    public static void main(String[] args){
        String str="bananasahhhnnnjjjjiiiikltu";
        HashMap<Character,Integer>map =new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
       for (char key: map.keySet()) {
           if (map.get(key) == 1) {
               System.out.print(key + " ");
           }
       }
        System.out.println();
        int  MaxCount=0;
        char maxchar=' ';
           for (char key: map.keySet()) {
               if (map.get(key)>MaxCount) {
                   MaxCount=map.get(key);
                   maxchar=key;

               }
           }
             System.out.print(MaxCount+ "=" +maxchar);


           }

       }




