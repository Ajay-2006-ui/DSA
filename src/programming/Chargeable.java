package programming;

interface Chargeable {
    void charge();
}

class Mobile implements Chargeable {
    private String brand;

    Mobile(String brand) {
        this.brand = brand;
    }

    @Override
    public void charge() {
        System.out.println(brand + " is charging");
    }
}
class Laptop implements Chargeable{
    private int model;
    Laptop(int model){
        this.model = model;
    }
    @Override
    public void charge() {
        System.out.println(model+ " laptop is charging");

    }
}

class Interface{
    public static void main(String[] args) {
        Mobile m1= new Mobile("ViVo");
        Laptop l1= new Laptop(2025);
        m1.charge();
        l1.charge();
    }
}
