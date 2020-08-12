package Challanges;

import java.util.Scanner;

//core concept: Array
public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please enter count of inputs: ");
        if (scanner.hasNextInt()){
            int input = scanner.nextInt();
            int[] arrMin = readIntegers(input);
            findMin(arrMin);//Finding minimum
        }else {
            System.out.println("Number input required!");
        }
    }

    //Read Integer Count
    public static int[] readIntegers(int count){
        int[] arr = new int[count];
        System.out.println("Please enter "+count+" Integers");
        for (int i = 0; i <arr.length ; i++) {
            if (scanner.hasNextInt()){
                arr[i] = scanner.nextInt();
            }else {
                System.out.println("Number input required!");
                break;
            }
        }
        return arr;
    }

    //to find minimum value
    public static void findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min <= arr[i]){
                continue;
            }else {
                min = arr[i];
            }
        }
        System.out.println("Min value is! "+ min);
    }
}
