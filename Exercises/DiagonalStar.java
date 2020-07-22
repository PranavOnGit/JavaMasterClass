package Exercises;

//Please refer DiagonalStar.txt for problem statement.
public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        }else {
            for (int i = 1; i <= number; i++){
                for (int j = 1; j <= number; j++){
                    if (i == 1 || i == number || i == j || j == 1 || j == number || (number - i + 1 == j)) {
                        System.out.print("*");
                        if (j == number) {
                            System.out.println();
                        }
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}