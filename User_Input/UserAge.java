package User_Input;

import java.util.Scanner;

// exception/error handling for finding user age code.
public class UserAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt){
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Please enter your Name: ");
            String name = scanner.nextLine();

            int age = 2020 - year;
            if(age >= 0 && age <= 100){
                System.out.println("Your name is '"+name+"' and you are '"+age+"' years old!");
            }else {
                System.out.println("Invalid input for birth year");
            }
        }else{
            System.out.println("Number format expected");
        }
        scanner.close();
    }
}
