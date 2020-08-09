package Challanges.OOP_Master;

public class Hamburger {
    private String name;
    private String breadRoll;
    private String meat;
    private boolean lettuce = false;
    private boolean tomato = false;
    private boolean carrot = false;

    private float baseCharge;
    private float additionalCharge;

    public Hamburger(String breadRoll, String meat, float baseCharge, float additionalCharge) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.baseCharge = baseCharge;
        this.additionalCharge= additionalCharge;
    }

    //constructor
    public float additionalItems(){
        if (lettuce){
            this.baseCharge += this.additionalCharge;
        }
        if (tomato){
            this.baseCharge += this.additionalCharge;
        }
        if(carrot){
            this.baseCharge += this.additionalCharge;
        }
        return baseCharge;
    }

    //setters
    public void setBaseCharge(float baseCharge) {
        this.baseCharge = baseCharge;
    }
    public void setAdditionalCharge(float additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
    public void setLettuce(boolean lettuce) {
        this.lettuce = lettuce;
    }
    public void setTomato(boolean tomato) {
        this.tomato = tomato;
    }
    public void setCarrot(boolean carrot) {
        this.carrot = carrot;
    }
    public void setName(String name) {
        this.name = name;
    }

    //getters
    public String getName() { return name; }
    public float getBaseCharge() { return baseCharge; }
    public float getAdditionalCharge() { return additionalCharge; }
    public boolean isLettuce() { return lettuce; }
    public boolean isTomato() { return tomato; }
    public boolean isCarrot() { return carrot; }
    public String getBreadRoll() { return breadRoll; }
    public String getMeat() { return meat; }
}
