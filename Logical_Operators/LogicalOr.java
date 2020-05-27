package Logical_Operators;

public class LogicalOr {
    public static void main(String[] args){

        int topScore = 100;

        if ( topScore == 100){
            System.out.println(" I'm Topper");
        }

        if ( topScore > 100){ // will print blank space
            System.out.println(" I'm Topper");
        }

        if ( topScore >= 100){
            System.out.println(" I'm Topper");
        }

        if ( topScore <= 100){ // will print blank space as it's false
            System.out.println(" I'm Topper");
        }

        //LOGICAL AND
        int obtainedMarks = 70;
        if ( topScore > obtainedMarks || obtainedMarks != 70){ //though second condition false ANS get printed as we a have used OR operator
            System.out.println(" Yes, I'm Topper");
        }
    }
}

