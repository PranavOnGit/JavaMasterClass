package Exercises;

//Please refer FlourPacker.txt for problem statement.
public class FlourPacker {
    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }

    //The parameter bigCount represents the count of big flour bags (5 kilos each).
    //The parameter smallCount represents the count of small flour bags (1 kilo each).
    //The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }else if(((bigCount * 5) + smallCount) < goal) {
            return false;
        }else if( smallCount >= (goal % 5)){
            return true;
        }
        return false;
    }
}
