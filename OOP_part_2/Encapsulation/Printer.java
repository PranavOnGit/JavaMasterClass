package OOP_part_2.Encapsulation;

// Create a class and demonstrate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private int toneLevel;
    private int  numOfPagesPrinted;
    private boolean duplex;

    //Constructor
    public Printer(int toneLevel, boolean duplex) {
        if(toneLevel > -1 && toneLevel <= 100){
            this.toneLevel = toneLevel;
        }else {
            this.toneLevel = -1;
        }
        this.numOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){
        if (tonerAmount >0 && tonerAmount <=100 ){
            if (this.toneLevel + tonerAmount > 100){
                return -1;
            }
            this.toneLevel += tonerAmount;
            return this.toneLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        if (duplex){
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode!");
        }
        this.numOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }
}
