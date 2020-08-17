package ArrayList;
import java.util.Scanner;

public class Main extends GroceryList {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("\nPlease enter the choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    addGItems();
                    break;
                case 2:
                    modifyGItems();
                    break;
                case 3:
                    searchGItem();
                    break;
                case 4:
                    removeGItem();
                    break;
                case 5:
                    groceryList.printItems();
                    break;
                case 6:
                    System.out.println("Bye!...");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\n**** Grocery Instructions ****");
        System.out.println("\r 0 - Show Grocery Instructions Menu:");
        System.out.println("\r 1 - Add Grocery Item:");
        System.out.println("\r 2 - Modify Grocery Item:");
        System.out.println("\r 3 - Search Grocery Item:");
        System.out.println("\r 4 - Remove Grocery Item:");
        System.out.println("\r 5 - Print the Grocery Item list:");
        System.out.println("\r 6 - Quit the Instruction Menu:");
    }

    public static void addGItems(){
        System.out.println("Please enter the grocery item:");
        groceryList.addItems(scanner.nextLine());
    }

    public static void modifyGItems(){
        System.out.println("please tell us the item position you want to modify");
        int pos = scanner.nextInt();
        scanner.nextLine();
        System.out.println(" Please write new item name: ");
        String newItem =  scanner.nextLine();
        groceryList.modifyItem(pos-1, newItem);
    }

    public static void searchGItem(){
        System.out.println("please enter item Name you want to search");
        String itemNm = scanner.nextLine();
        if (groceryList.findItem(itemNm) != null ){
            System.out.println("Found '"+itemNm+"' in the Grocery List");
        }else {
            System.out.println("oops! there is no item in the Grocery list which you are looking.");
        }
    }

    public static void removeGItem(){
        System.out.println("Please enter the item position you want to remove");
        int itemPos = scanner.nextInt();
        groceryList.removeItem(itemPos-1);
    }


}
