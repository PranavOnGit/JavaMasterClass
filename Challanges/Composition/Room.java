package Challanges.Composition;

public class Room {
    private Table table;
    private Window window;
    private Chair chair;

    public Room(Table table, Window window, Chair chair) {
        this.table = table;
        this.window = window;
        this.chair = chair;
    }

    public Table getTable() { return table; }
    public Window getWindow() { return window; }
    public Chair getChair() { return chair; }
}
