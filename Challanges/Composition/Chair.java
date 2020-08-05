package Challanges.Composition;

public class Chair {
    private int legs;
    private String color;
    private String woodType;
    private Size size;

    public Chair(int legs, String color, String woodType, Size size) {
        this.legs = legs;
        this.color = color;
        this.woodType = woodType;
        this.size = size;
    }

    public void getChair(int count){
        System.out.println(count +" chair(s) are/is detected in the Room!");
    }

    public int getLegs() { return legs; }
    public String getColor() { return color; }
    public String getWoodType() { return woodType; }
    public Size getSize() { return size; }
}
