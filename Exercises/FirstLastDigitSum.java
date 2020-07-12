package Exercises;

//please refer FirstLastDigitSum.txt for problem statement
public class FirstLastDigitSum {
    public static void main(String[]args){
        System.out.println(sumFirstAndLastDigit(-3));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        } else{
            int lastdigit = number % 10;
            int reverse = 0;
            while(number != 0 || number > 0){
                int lastdigi = number % 10;
                reverse = reverse * 10;
                reverse += lastdigi;
                number = number / 10;
            }
            int sum = lastdigit + (reverse % 10);
            return sum;
        }
    }
}
