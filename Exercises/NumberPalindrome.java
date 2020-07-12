package Exercises;

//please refer NumberPalindrome.txt for problem statement
public class NumberPalindrome {

    public static boolean isPalindrome(int num){
        int reverse = 0;
        int number = num;
        while( number != 0 || number > 0){
            int lastdigit = number % 10;
            reverse = reverse * 10;
            reverse += lastdigit;
            number = number /10;
        }
        if(num == reverse){
            return true;
        }
        return false;
    }

    public static void main(String[]args){
        System.out.println(isPalindrome(-121));
    }
}
