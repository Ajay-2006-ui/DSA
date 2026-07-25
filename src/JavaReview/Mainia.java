package JavaReview;

abstract class anim{
    String name;

    anim(String name) {
        this.name = name;
        System.out.println("Animal Constructor");
    }

    abstract void sound();
}

class Dogia extends anim {

    Dogia(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class Mainia {
    public static void main(String[] args) {

        Dogia d = new Dogia("Tommy");

        d.display();
        d.sound();
    }


}
