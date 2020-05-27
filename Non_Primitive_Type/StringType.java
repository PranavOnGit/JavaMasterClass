package Non_Primitive_Type;

public class StringType {
    public static void main(String[] args){
        String myString = "This is my String ";
        System.out.println(myString);

        String mySecondString = "this is test "+ myString;
        System.out.println(mySecondString);

        String myStringT = "qwe string ";
        myStringT = myStringT + 20;
        System.out.println(myStringT);

        String myIntegerString = "30.23 ";
        myStringT = myIntegerString + myStringT;
        System.out.println(myStringT);

        int myInt = 123;
        myString = myString + myInt;
        System.out.println(myString);// String output by concatinating

        double myDouble = 23.345;
        myString = myString + myDouble;
        System.out.println(myString);// String output by concatinating
    }
}
