package Challanges.Composition;

public class Table {
    private int legs;
    private String woodType;
    private Dimensions dimensions;

    public Table(int legs, String woodType, Dimensions dimensions) {
        this.legs = legs;
        this.woodType = woodType;
        this.dimensions = dimensions;
    }

    public void tableSet(String color, Boolean drawer){
        if (drawer){
            System.out.println(" Table has a drawer and table is in "+ color +" color");
        }
    }

    public int getLegs() { return legs; }
    public String getWoodType() { return woodType; }
    public Dimensions getDimensions() { return dimensions; }
}

