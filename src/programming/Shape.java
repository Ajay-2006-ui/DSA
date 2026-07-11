package programming;

 abstract class Shape {
    abstract  void area();

}
class Circle extends Shape {
    private int radius;
    Circle(int radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        System.out.println("Area of Circle: " +3.14*radius*radius);

    }

    }

class Rectangle extends Shape {
    private int length;
    private int breadth;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void area() {
        System.out.println("Area of Rectangle: " +length*breadth);
    }
}
class Express{
     public static void main(String[] args) {
         Shape s1=new Circle(10);
         Shape s2=new Rectangle(10,20);
         s1.area();
         s2.area();
     }
}
