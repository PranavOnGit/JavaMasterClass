package Exercises;

//please refer largest prime.txt for problem statement.
public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){
        int i = 0;
        if(number <= 1){
            return -1;
        }else {
            for (i = 2; i < number; i++){
                if(number % i == 0){
                    number /= i;
                    i--;
                }
            }
            return i;
        }
    }
}
