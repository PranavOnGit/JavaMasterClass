package Exercises;

//refer TeenNumberChecker.txt for problem statement
public class TeenNumberChecker {
    public static void main(String[] args){
        System.out.println(hasTeen(23, 10, 16));
        System.out.println(isTeen(23));
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        if((age1 >= 13 && age1 <=19) || (age2 >=13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isTeen(int age1){
        if (age1> 0 && age1>=13 && age1<=19)
            return true;
        else
            return false;
    }
}
