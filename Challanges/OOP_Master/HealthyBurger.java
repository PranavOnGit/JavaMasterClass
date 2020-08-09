package Challanges.OOP_Master;

public class HealthyBurger extends Hamburger{
    private boolean potato;
    private boolean spinach;

    public HealthyBurger(String breadRoll, String meat, float baseCharge, float additionalCharge, boolean potato, boolean spinach) {
        super(breadRoll, meat, baseCharge, additionalCharge);
        this.potato = potato;
        this.spinach = spinach;
    }

    //Setters
    @Override
    public void setName(String name) {
        super.setName("Healthy Hamburger");
    }
    public float additionalItems() {
        float charges = this.getBaseCharge();
        if(super.isCarrot()){
            charges += this.getAdditionalCharge();
        }
        if(super.isLettuce()){
            charges += this.getAdditionalCharge();
        }
        if (super.isTomato()){
            charges += this.getAdditionalCharge();
        }
        if(this.potato){
            charges += this.getAdditionalCharge();
        }
        if (this.spinach){
            charges += this.getAdditionalCharge();
        }
        return charges;
    }
    //Getter
    @Override
    public String getBreadRoll() {
        return super.getBreadRoll();
    }
    @Override
    public String getMeat() {
        return super.getMeat();
    }

    public void setPotato(boolean potato) { this.potato = potato; }
    public void setSpinach(boolean spinach) { this.spinach = spinach; }

    public boolean isPotato() { return potato; }
    public boolean isSpinach() { return spinach; }
}
