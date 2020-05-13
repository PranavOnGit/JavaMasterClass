package Challanges;

public class DataTypesCalc {
    public static void main(String[] args){
        byte myByteValue = 123;
        short myShortValue = 3214;
        int myIntValue = 4279;

        long myLongValue = 5000L + ( 10L * (myByteValue +  myShortValue + myIntValue));
        System.out.println("Long: "+myLongValue);

        long ShortValue = (short) 5000 + ( 10 * (myByteValue +  myShortValue + myIntValue));
        System.out.println("Short: "+ShortValue);
    }
}
