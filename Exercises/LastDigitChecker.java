package Exercises;

//Please refer LastDigitChecker.txt for problem statement.
public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(isValid(num1) && isValid(num2) && isValid(num3)){
            int ldigit1 = num1 % 10;
            int ldigit2 = num2 % 10;
            int ldigit3 = num3 % 10;
            if((ldigit1 == ldigit2) || (ldigit1 == ldigit3) || (ldigit2 == ldigit3))
                return true;
            else
                return false;
        }else {
            return false;
        }
    }
    public static boolean isValid(int num){
        if(num >= 10 && num <= 1000)
            return true;
        else
            return false;
    }

    public static void main(String[]args){
        System.out.println(hasSameLastDigit(22,23,34));
    }
}
