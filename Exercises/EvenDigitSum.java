package Exercises;

//please refer EvenDigitSum.txt for problem statement
public class EvenDigitSum {
    public static void main(String[]args){
        System.out.println("Sum of Even Digits of number 123456 is :"+getEvenDigitSum(123456));
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }else{
            int sum = 0;
            while ((number != 0) || (number > 0)){
                int lastdigit = number % 10;
                if(lastdigit % 2 == 0){
                    sum += lastdigit;
                }
                number /= 10;
            }
            return sum;
        }
    }
}
