package Exercises;

//Please refer SumOddRange.txt for problem statement.
public class SumOddRange {
    public static void main(String[]args){
        System.out.println(sumOdd(10, 5));
    }

    public static boolean isOdd(int number){
        if(number > 0){
            if(number%2 == 1){
                return true;
            }
            return false;
        }else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        int sum =0;
        if((end < start) || (start < 0)){
            return -1;
        }else{
            for(int i = start; i <= end; i++){
                if(isOdd(i)){
                    sum = sum += i;
                }
            }
        }
        return sum;
    }

}
