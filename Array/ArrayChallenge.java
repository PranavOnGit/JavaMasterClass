package Array;
import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = getIntegers(5);
        int [] sorted = sortIntegers(array);
        System.out.println("\r Ascending Sorted elements are:");
        printArray(sorted);
    }

    //To input array values
    public static int[] getIntegers(int capacity){
        int[] arrayInt = new int[capacity];
        System.out.println("Enter "+capacity+" integers values\r");
        for (int i = 0; i < arrayInt.length; i++){
                System.out.println("Enter value for position: "+i);
                arrayInt[i] = scanner.nextInt();
        }
        return arrayInt;
    }

    //To Print array
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println("Position "+i+" contain: "+array[i]);
        }
    }

    //To Sort array
    public static int[] sortIntegers(int[] array){
        int[] sortedArray  = new int[array.length];
        for (int i= 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < sortedArray.length-1 ;i++){
                if (sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
