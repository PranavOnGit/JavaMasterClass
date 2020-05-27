package Challanges;

//#### Create a method called displayHighScorePosition

// it should a players name as a parameter, and a 2nd parameter as a position in the high score table
// You should display the players name along with a message like " managed to get into position " and the
// position they got and a further message " on the high score table".
//
// Create a 2nd method called calculateHighScorePosition
// it should be sent one argument only, the player score
// it should return an in
// the return data should be
// 1 if the score is >=1000
// 2 if the score is >=500 and < 1000
// 3 if the score is >=100 and < 500
// 4 in all other cases
// call both methods and display the results of the following
// a score of 1500, 900, 400, 50, 1000, 100, 500


public class MethodChallage {
    public static void main(String[] args){

        int position = calculateHighScorePosition(1200);
        displayHighScorePosition("Tina", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Kevin", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Rema", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Sati", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Raven", position);

    }
    public static void displayHighScorePosition(String Name, int position){
        System.out.println(Name+" managed to get postion "+position+" on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        int postion = 4;

        if(score >= 1000){
            postion = 1;
        }else if( score >= 500){
            postion = 2;
        }else if( score >= 100){
            postion = 3;
        }
        return postion;
    }
}
