package Challanges;
import java.util.Arrays;
import java.util.Scanner;

//core concept: Array, Reference type;
public class ReverseArrayChallenge {
    private static Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Please enter array elements");
        for (int i = 0; i < array.length ; i++) {
            if (scanner.hasNextInt()){
                array[i] = scanner.nextInt();
            }else {
                System.out.println("Please enter Integer values.");
            }
        }

        System.out.println("Array is: "+Arrays.toString(array));
        reverse(array);//reference type
        System.out.println("Reversed Array is: "+Arrays.toString(array));

    }
    public static void reverse(int[] array){
        int high = array.length-1;
        for (int i = 0; i < array.length/2 ; i++) {
                int temp = array[i];
                array[i] = array[high];
                array[high] = temp;
            high --;
        }
    }
}
