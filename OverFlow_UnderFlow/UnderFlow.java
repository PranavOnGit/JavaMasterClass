package OverFlow_UnderFlow;

public class UnderFlow {
    public static void main(String[] args){
        int myIntValue = 10000;
        int myIntMinValue = Integer.MIN_VALUE; //Minimum Integer value (-2147483648)

        System.out.println("MIN Integer value = "+ myIntMinValue); // -2147483648
        System.out.println("Busted UnderFlow value = "+ (myIntMinValue - 1)); // 2147483647
    }
}
