package Challanges;

public class OperatorChallange {

    public static void main(String[] args){
        double num1 = 20.00d;
        double num2 = 80.00d;
        double result = 100 * (num2 + num1);
        System.out.println("Result is "+result);

        double rem = result % 40.00d;
        System.out.println("remainder is "+rem);

        boolean isRem = (rem == 0) ? true : false;
        System.out.println("isRem: "+isRem);

        if(!isRem){ // OR if(isRem != true) // OR if(isRem == false)
            System.out.println("Got Some Remainder");
        }

    }
}
