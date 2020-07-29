package OOP_Part_1.Inheritance;

public class Audi extends Car {
    private String bodyType;
    private String madeIn;

    public Audi(String color, String model, String engine, String bodyType, String madeIn) {
        super(4, color, model, engine);
        this.bodyType = bodyType;
        this.madeIn = madeIn;
    }

    public void driftingWay(){
        super.speed(300);
        System.out.println("audi.driftingWay() called");
    }

    @Override
    public String getModel() {
        return super.getModel();
    }
    @Override
    public String getColor() {
        return super.getColor();
    }
}
