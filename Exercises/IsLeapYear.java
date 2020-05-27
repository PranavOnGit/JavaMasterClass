package Exercises;

//Checkout IsLeapYear.txt for problem statement
public class IsLeapYear {
//    public static void main(String[]args){
//        System.out.println(isLeapYear(10000));
//    }
    public static boolean isLeapYear(int year){
        if(((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (year > 0 && year < 9999)){
            return true;
        }else{
            return false;
        }
    }
}
