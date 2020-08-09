package Challanges.OOP_Master;

public class DeluxHamburger extends  Hamburger{
    private boolean chips = false;
    private boolean drinks = false;

    public DeluxHamburger(String breadRoll, String meat, float baseCharge, float additionalCharge, boolean chips, boolean drinks) {
        super(breadRoll, meat, baseCharge, additionalCharge);
        this.chips = chips;
        this.drinks = drinks;
    }


    //Setters
    @Override
    public void setName(String name) {
        super.setName("Delux Hamburger");
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
        if(this.chips){
            charges += this.getAdditionalCharge();
        }
        if (this.drinks){
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

    public void setChips(boolean chips) { this.chips = chips; }
    public void setDrinks(boolean drinks) { this.drinks = drinks; }

    public boolean isChips() { return chips; }
    public boolean isDrinks() { return drinks; }
}
