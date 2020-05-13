package Primitive_Types;

public class FloatDouble {
    public static void main(String[] args){

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("Float Min Value is: "+myFloatMinValue);
        System.out.println("Float Min Value is: "+myFloatMaxValue);

        double myDoubleMinValue = Float.MIN_VALUE;
        double myDoubleMaxValue = Float.MAX_VALUE;
        System.out.println("Double Min Value is: "+myDoubleMinValue);
        System.out.println("Double Min Value is: "+myDoubleMaxValue);

        float num1 = 5; //valid
        float num2 = 2.5f; //valid
        float num3 = (float) 2.5; //valid
        //Same for Double

        int test1 = 5;
        float test2 = 5f / 3f;
        double test3 = 5d / 3f;

        System.out.println("Integer: "+test1);
        System.out.println("float: "+test2);
        System.out.println("double: "+test3);

        double pi = 3.1415927d;
        double numtemp = 3_00_00.4_12_4040d; //valid
        System.out.println(pi);
        System.out.println(numtemp); //30000.412404 last 0 ignored as its not needed
    }
}
