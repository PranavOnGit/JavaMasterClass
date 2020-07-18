package Exercises;

//please refer PerfectNumber.txt for problem statement.
public class PerfectNumber {
    public static void main(String[]args){
        System.out.println(isPerfectNumber(12));
    }
    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }else {
            int sum = 0;
            for (int i = 1; i <= number; i++){
                if(number % i == 0){
                    if(number == i){break;}
                    else{sum += i;}
                }
            }
            return (sum == number) ? true : false;
        }
    }
}
