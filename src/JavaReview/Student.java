package JavaReview;

public class Student {
    String name;
    int age;
     Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     void display() {
         System.out.print(this.name+" ");
         System.out.println(this.age);
     }
     void display(String title){
         System.out.println(title);
         System.out.println(this.name);
         System.out.println(this.age);
     }
     void display(int copies){
         for (int i = 0; i < copies; i++) {
             System.out.println(this.name);
             System.out.println(this.age);
         }
     }
     public static void main(String[] args) {
         Student st= new Student("Ajay",20);
         st.display();
         st.display("student details");
         st.display(3);
     }


}
