package Challanges;

/*
Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.

The method should not return any value (hint: void)

Using a switch statement print Sunday, Monday,...,Saturday if the int parameter day is 0, 1, ... , 6 respectively, otherwise it should print Invalid day.

Bonus:
	Write a second solution using if then else, instead of using switch.
	Create a new project in IntelliJ with the  name ÅgDayOfTheWeekChallengeÅh

*/


public class DayOfTheWeekChallenge {
    public static void main(String[]args){
        int param  = 4;
        printDayOfTheWeek(param);
    }

    //    Switch Case
    /*
    public static void printDayOfTheWeek(int param){
        switch (param){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day!");
                break;
        }
    }
     */

    // IF-THEN
    public static void printDayOfTheWeek(int param){
        if (param == 0){
            System.out.println("Sunday");
        }else if(param == 1){
            System.out.println("Monday");
        }else if(param == 2){
            System.out.println("Tuesday");
        }else if(param == 3){
            System.out.println("Wednesday");
        }else if(param == 4){
            System.out.println("Thursday");
        }else if(param == 5){
            System.out.println("Friday");
        }else if(param == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid Day!");
        }
    }
}
