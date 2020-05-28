package Method_Overloading;

//Same method name but different no of parameters
public class MethodOverloading {
    public static void main(String[] args){
        int score = calculateScore(456, 6);
        calculateScore(score);
    }
    public static int calculateScore(int marks, int noOfSubjects){ // method 1
        int score = marks * noOfSubjects;
        return score;
    }
    public static void calculateScore(int score){ // method 2
        System.out.println("Total Score is: "+score);
    }
}
