package JavaReview;

public class Student {
    String name;
    static String College="VTU";
    Student (String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name: "+name+" "+College);
    }
    public static void main(String[] args) {
        Student s1=new Student("Sam");
        Student s2=new Student("Raj");
        s1.display();
        s2.display();
    }
}
