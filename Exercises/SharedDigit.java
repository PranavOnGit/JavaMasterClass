package Exercises;

//Please refer SharedDigit.txt for problem statement.
public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1 >= 10 && num1 <= 99) && (num2 >=10 && num2 <= 99)) {
            while (num1 != 0 && num2 != 0) {
                int lastdigit = num1 % 10;
                int lastdigit1 = num2 % 10;
                num1 /= 10;
                num2 /= 10;
                if ((lastdigit == lastdigit1) || (num1 == num2) || (num1 == lastdigit) || (num1 == lastdigit1) || (num2 == lastdigit) || (num2 == lastdigit1)) {
                    return true;
                }else {
                   return false;
                }
            }
        }
        return false;
    }

    public static void main(String[]args){
        System.out.println(hasSharedDigit(12,43));
    }
}
