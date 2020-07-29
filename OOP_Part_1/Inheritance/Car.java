package OOP_Part_1.Inheritance;

public class Car {
    private int wheels;
    private String color;
    private String model;
    private String engine;

    //Constructor
    public Car(int wheels, String color, String model, String engine) {
        this.wheels = wheels;
        this.color = color;
        this.model = model;
        this.engine = engine;
    }

    public void firingSound(String firingSound){
        System.out.println("Firing Sound: "+firingSound);
        System.out.println("car.firingSound() called");
    }
    public void speed(int speed){
        System.out.println("Speed: "+speed);
        System.out.println("car.speed() called");
    }

    //Getters
    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }

    //Main
    public static void main(String[] args) {
        Car car = new Car(4, "Red", "V108", "123123HP" );
        Audi audi = new Audi("Blue", "Q8", "098878HP", "saloon", "Germany");
        Lamborghini lam = new Lamborghini("Blue", "Miura", "098878HP", "Sporty", 2);

        audi.speed(500);
        audi.driftingWay();
        System.out.println("Model: "+audi.getModel());
        System.out.println("Color: "+audi.getColor());

        System.out.println();
        lam.driftingWay();
        lam.speed(700);
        System.out.println("Model: "+lam.getModel());
        System.out.println("Color: "+lam.getColor());
    }
}
