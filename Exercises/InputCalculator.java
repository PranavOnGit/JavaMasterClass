package Exercises;
import java.util.Scanner;

//Please refer InputCalculator.txt for problem statement
public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        long avg = 0;
            while (true){
                boolean isInt = scanner.hasNextInt();
                if(!isInt){
                    break;
                }else{
                    int number = scanner.nextInt();
                    count++;
                    sum += number;
                    avg = (long)(Math.round((double)sum/(double)count));
                }
            scanner.nextLine();
            }
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
