package If_Then;

public class IfThen {   // If_Then Statement
    public static void main(String[] args){

        boolean isAlian = false;
        if(isAlian == false)
            System.out.println("It is an Alian");

        if(isAlian == false);  // ; works as end of this line
            System.out.println("It is an Alian");

        if(isAlian == true);  // ; works as end of this line and prints next line
            System.out.println("It is an Alian");

        if(isAlian == true) // bloacks 1st line and prints next line
            System.out.println("It is an Alian");
            System.out.println("Scared of Alians");

        if(isAlian == false) // prints both lines
            System.out.println("It is an Alian");
            System.out.println("Scared of Alians");
    }
}
