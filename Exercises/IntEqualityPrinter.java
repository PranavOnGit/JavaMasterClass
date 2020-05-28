package Exercises;

//Go through IntEqualityPrinter.txt for problem statement

public class IntEqualityPrinter {
//        public static void main(String[]args){
//            printEqual(1, 3, 4);
//            printEqual(1, 1, 4);
//            printEqual(1, 8, -4);
//            printEqual(1, 8, 0);
//        }
        public static void printEqual(int x, int y, int z){
        if(x < 0 || y < 0 || z < 0 ){
            System.out.println("Invalid Value");
        }
        else if(x == y && y == z && x == z){
            System.out.println("All numbers are equal");
        }
        else if(!(x == y) && !(y == z) && !(x == z)){
            System.out.println("All numbers are different");
        }
        else if(x == y || y == z || x == z){
            System.out.println("Neither all are equal or different");
        }
    }
}
