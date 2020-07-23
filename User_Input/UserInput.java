package User_Input;

import java.util.Scanner;

//Reading user input
public class UserInput {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth year");
        int year = scanner.nextInt();
        scanner.nextLine();//To handel next line character (enter key)

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        int age = 2020 - year;
        System.out.println("Your name is \'"+name+"\' and you are '"+age+"' years old!");

        scanner.close();
    }
}
