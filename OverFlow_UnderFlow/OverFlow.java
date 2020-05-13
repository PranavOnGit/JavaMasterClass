package OverFlow_UnderFlow;

public class OverFlow {
    public static void main(String[] args){
        int myIntValue = 10000;
        int myIntMaxValue = Integer.MAX_VALUE; //Max Integer value (2147483648)

        System.out.println("MAX Integer value = "+ myIntMaxValue ); // 2147483648
        System.out.println("Busted OverFlow value = "+ (myIntMaxValue + 1)); // -2147483648
    }
}
