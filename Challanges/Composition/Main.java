package Challanges.Composition;

//OOP core concept: Composition (Has-A relationship)

// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.

public class Main {
    public static void main(String[] args) {
        Dimensions dimensionsT = new Dimensions(23, 12);
        Dimensions dimensionsW = new Dimensions(20, 10);
        Size size = new Size(15, 30);

        Table theTable = new Table(4, "Sagwan", dimensionsT);
        Window theWidow = new Window(3, 2, dimensionsW);
        Chair theChair =  new Chair(4, "Red", "Sagwan", size );

        Room room = new Room(theTable, theWidow, theChair);
        room.getChair().getChair(4);
        room.getTable().tableSet("Yellow", true);
        room.getWindow().tableInfo("left", "Creme");
    }
}
