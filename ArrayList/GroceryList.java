package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList{
    private ArrayList<String> groceryList = new ArrayList<String>();

    //Add Items
    public void addItems(String item){
        groceryList.add(item);
        System.out.println("Item added!");
    }

    //Print Items
    public void printItems(){
        System.out.println("You have "+groceryList.size()+" items in your list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i+1 +" "+ groceryList.get(i));
        }
    }

    //Remove Item
    public void removeItem(int item){
        String getItem = groceryList.get(item);
        groceryList.remove(getItem);
        System.out.println("Item has been removed");
    }

    //Change Item
    public void modifyItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("New item has at "+(position+1)+" has been modified!");
    }

    //Search Item
    public String findItem(String searchItem){
        int itemPosition = groceryList.indexOf(searchItem);
        if (itemPosition >= 0){
            return groceryList.get(itemPosition);
        }
        return null;
    }
}
