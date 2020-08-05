package Challanges.Composition;

public class Window {
    private int numberOfWidows;
    private int slidersCount;
    private Dimensions dimensions;

    public Window(int numberOfWidows, int slidersCount, Dimensions dimensions) {
        this.numberOfWidows = numberOfWidows;
        this.slidersCount = slidersCount;
        this.dimensions = dimensions;
    }

    public void tableInfo(String position, String color){
        System.out.println("table is in "+position+" side in the room with color "+ color);
    }
    public int getNumberOfWidows() { return numberOfWidows; }
    public int getSlidersCount() { return slidersCount; }
    public Dimensions dimensions(){ return dimensions; }
}
