package Array;
import java.util.Scanner;

public class ArrayCheck {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] array = namesInput(5);
        System.out.println();
        System.out.println("Names are: ");
        namesOutput(array);
    }

    public static String[] namesInput(int capacity){
        String[] names = new String[capacity];
        System.out.println("Please enter "+capacity+"names:");
        for (int i = 0 ; i < names.length; i++){
            System.out.println("Name: #"+i);
            names[i] = scanner.nextLine();
        }
        return names;
    }
    public static void namesOutput(String[] arr){
        for (int i = 0; i < arr.length ; i++){
            System.out.println("Name #"+i+": "+ arr[i]);
        }
    }
}
