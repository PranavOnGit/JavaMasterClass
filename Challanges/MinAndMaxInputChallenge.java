package Challanges;

import java.util.Scanner;

/*
-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message ÅgEnter number:Åh
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.

Hint:
-Use an endless while loop.

Bonus:
-Create a project with the name MinAndMaxInputChallenge.
* */

// INT MIN = -2147483648
// INT MAX = 2147483647

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
//       int min = 0, max = 0; {both way by uncommenting commented lines and commenting below two int declaration}
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
//       boolean first = true;

       while (true){
           System.out.println("Enter Number:");
           boolean hasAnINt = scanner.hasNextInt();

           if(hasAnINt){
               int number = scanner.nextInt();
//               if(first){
//                   first = false;
//                   min = number;
//                   max = number;
//               }
               if(number > max){
                   max = number;
               }
               if(number < min){
                   min = number;
               }
           }else{
               break;
           }
           scanner.nextLine();
       }
        scanner.close();
        System.out.println("min: "+min+" max: "+max);
    }
}
