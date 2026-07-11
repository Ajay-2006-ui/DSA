package JavaReview;

public class Vowels {
    int CountVowels(String s,int index,int count){
        String vowels="aeiouAEIOU";
        if(index==s.length()){
            return count;

        }
        char ch=s.charAt(index);
        if(vowels.indexOf(ch)!=-1){
            count++;

        }
        return CountVowels(s,index+1,count);

    }
    public static void main(String[] args) {
        String s="Education";
        Vowels Vt=new Vowels();
       System.out.print( Vt.CountVowels(s,0,0));

    }
}
