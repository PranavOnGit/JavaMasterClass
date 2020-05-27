package methods;

public class NonPrametericAndParametricMethod {

    public static void main(String[] args){

        int score = 3000;
        int levelCompleted = 8;
        int bonus = 1000;
        boolean gameOver = true;

        //method declaration [Non Parametric]
        sayHello();

        //method declaration [Parametric]
        calculateSore(gameOver, score, bonus, levelCompleted); //1st WAY
        calculateSoreAgain(true, 3000, 1000, 8); //2nd WAY

    }

    //method defination
    public static void sayHello(){
        System.out.println("Hello, there!");
    }

    public static void calculateSore(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("First way Final Score is: "+finalScore);
        }
    }

    public static void calculateSoreAgain(boolean gameOver, int score, int bonus, int levelCompleted){
        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Second way Final Score is: "+finalScore);
        }
    }
}
