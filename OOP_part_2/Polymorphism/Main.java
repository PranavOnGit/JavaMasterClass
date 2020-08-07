package OOP_part_2.Polymorphism;

class Car{
    private boolean engine;
    private int wheels;
    private int cylinders;
    private String name;

    //Constructor
    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    //Methods
    public String startEngine(){
        return  "Engine is ignited!";
    }
    public String breakPushed(){
        return "Car has stopped!";
    }
    public String accelerate(){
        return "Car is accelerated!";
    }

    //Getters
    public boolean isEngine() { return engine; }
    public int getWheels() { return wheels; }
    public int getCylinders() { return cylinders; }
    public String getName() { return name; }
}
class Audi extends Car{

    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Engine ignited for Audi!";
    }
    @Override
    public String breakPushed() {
        return "Audi is stopped due to break!";
    }
    @Override
    public String accelerate() {
        return "Audi is getting accelerated!";
    }
}
class BMW extends Car{

    public BMW(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Engine ignited for BMW!";
    }
    // breakPushed method isn't added here
    @Override
    public String accelerate() {
        return  "BMW is getting accelerated!";
    }
}

class Jeep extends Car{

    public Jeep(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Engine ignited for Jeep!";
    }
    @Override
    public String breakPushed() {
        return "Jeep is stopped due to break!";
    }
    // accelerate method isn't added here
}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++){
            Car car = randomCar();
            System.out.println(" Car Num: "+i+
                                "\n Car Name: "+ car.getName() +
                                "\n Car cylinders: "+ car.getCylinders() +
                                "\n "+car.startEngine() +
                                "\n "+car.breakPushed() +
                                "\n "+car.accelerate() +"\n");
        }

    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random no generated was: "+randomNumber );
        switch (randomNumber){
            case 1:
                return new Audi(4, "Audi");
            case 2:
                return new BMW(3, "BMW");
            case 3:
                return new Jeep(6, "Jeep");
        }
        return null;
    }
}
