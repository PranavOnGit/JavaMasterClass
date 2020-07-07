package Challanges;

/*
Create a for statement using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided with both 3 and also with 5.
For those numbers that met the above conditions, print out the number.
break out of the loop once you find 5 numbers that met the above conditions.
After breaking out of the loop print the sum of the numbers that met the above conditions.
Note: Type all code in main method
*/

public class Sum3and5 {
    public static void main(String[]args){
        int sum = 0, cnt = 0;
        for(int i = 1; i <= 1000; i++){
            if(i%3 == 0 && i%5 == 0){
                if(cnt != 5){
                    sum += i;
                    System.out.println("num: "+i);
                    cnt++;
                }else{
                    break;
                }
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
