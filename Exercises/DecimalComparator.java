package Exercises;
// follow instructions in DecimalComparator.txt file

public class DecimalComparator {
//    public static void main(String[] args){
//        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
//    }
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2){
            //        System.out.println((int)(number1 * 1000));
            //        System.out.println((int)(number2 * 1000));
            if( (int)(number1 * 1000) == (int)(number2 * 1000)){
                return true;
            }else{
                return false;
            }
    }
}
