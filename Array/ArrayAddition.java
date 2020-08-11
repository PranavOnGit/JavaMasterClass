package Array;
import java.util.Scanner;
public class ArrayAddition {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array1 = array1Input(4);
        int[] array2 = array2Input(4);
        int[] arrSum = arrayAddition(array1, array2);
        printArray(arrSum);
    }

    //Array 1 input
    public static int[] array1Input(int count){
        int[] input = new int[count];
        System.out.println("Input "+count+" numbers for 1st Array:");
        for (int i = 0; i < input.length ; i++) {
            System.out.println("Position: "+i);
            input[i] = scanner.nextInt();
        }
        return input;
    }

    //Array 2 Input
    public static int[] array2Input(int count){
        int[] input = new int[count];
        System.out.println("Input "+count+" numbers for 2nd Array:");
        for (int i = 0; i < input.length ; i++) {
            System.out.println("Position: "+i);
            input[i] = scanner.nextInt();
        }
        return input;
    }

    //Addition
    public static int[] arrayAddition(int[] arr1, int[] arr2){
        int[] sum = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == j){
                    sum[i] = arr1[i] + arr2[j];
                }
            }
        }
        return sum;
    }

    //PrintArray
    public static void printArray(int[] arr){
        System.out.println("Sum of array elements are");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
