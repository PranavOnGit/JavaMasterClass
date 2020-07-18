package Exercises;

//Greatest Common divisor (GCD)
//please refer GCD.txt for problem statement.
public class GCD {
    public static void main(String[]args){
        System.out.println(getGreatestCommonDivisor(961, 1271));
    }

    public static int getGreatestCommonDivisor (int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }else{
            for(int i= 40; i >= 1; i--){
                if(first % i == 0 && second % i == 0){
                    return i;
                }
            }
        }
        return -1;
    }
}

