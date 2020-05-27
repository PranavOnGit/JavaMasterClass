package Statements;

public class Statements {
    public static void main(String[] args){

        int myVar = 10; // Whole line is Statement
        myVar++; // line is Statement
        myVar--; // line is Statement
        System.out.println(" Part of statement"); // line is Statement

        System.out.println(" Still part " +  //All three lines is statement
                " of the " +
                "statement");

        //Lines ends with ; are statements

        int myVar1 = 10; myVar1++ ; System.out.println(" Also this"); // statement
    }
}
