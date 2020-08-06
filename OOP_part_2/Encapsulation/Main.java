package OOP_part_2.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(56, false);

        System.out.println("Initial page count: "+ printer.getNumOfPagesPrinted());
        int pagesPrinted =  printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted +", new total print count for printer is "+ printer.getNumOfPagesPrinted());
        pagesPrinted =  printer.printPages(2);
        System.out.println(" Pages printed was "+ pagesPrinted +", new total print count for printer is "+ printer.getNumOfPagesPrinted());
    }
}
