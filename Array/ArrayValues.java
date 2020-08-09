package Array;
import java.util.Scanner;

public class ArrayValues {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] intValue = setValue(5);
        for (int i = 0 ; i < intValue.length ; i++ ){
            System.out.println("Array value: "+intValue[i]+" at position: "+i);
        }
        System.out.println("Avarage of all values: "+getAvg(intValue));

    }
    public static int[] setValue(int number){
        int[] values = new int[number];
        System.out.println("Enter "+ number +" Integer value.\r");
        for (int i = 0 ; i < values.length ; i++){
            System.out.println("#"+(i+1));
            if(sc.hasNextInt()){
                values[i] = sc.nextInt();
            }else {
                System.out.println("Please enter number format only!");
                break;
            }
        }
        return values;
    }

    public static double getAvg(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
}
