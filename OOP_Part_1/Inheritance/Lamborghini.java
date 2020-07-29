package OOP_Part_1.Inheritance;

public class Lamborghini extends Car{
    private String interiorType;
    private int seats;

    public Lamborghini(String color, String model, String engine, String interiorType, int seats) {
        super(4, color, model, engine);
        this.interiorType = interiorType;
        this.seats = seats;
    }

    public void driftingWay(){
        super.firingSound("Silent");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void speed(int speed) {
        super.speed(speed);
        System.out.println("lamborghini.speed() called");
    }
}
