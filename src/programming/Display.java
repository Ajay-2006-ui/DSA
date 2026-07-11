package programming;

public class Display {
    public static void main(String[] args) {
        String s = "****";
        String m="";
        int i=0;
        while(i<s.length()){
            m=m+s.charAt(i);
            System.out.println(m);
            i++;

        }

    }
}