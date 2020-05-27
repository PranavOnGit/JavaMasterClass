package Operators;

public class TernaryOperator {
    public static void main(String[] args){

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if(wasCar){ // No OP as condition is false
            System.out.println("wasCar is output");
        }

        isCar = true;
        boolean wasCar1 = isCar ? true : false;
        if(wasCar1){ // OP as condition is true
            System.out.println("wasCar1 is output");
        }
    }
}
