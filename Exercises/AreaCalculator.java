package Exercises;

//Method Overloading
//Checkout AreaCalculator.txt for problem statement

public class AreaCalculator {
//    public static void main(String[] args) {
//        System.out.println(area(12));;
//        System.out.println(area(12, 12));
//    }
    //Area of Circle
    public static double area(double radius){
        if(radius >= 0){ //Area of circle
            return Math.PI * radius * radius;
        }else{
            return -1;
        }
    }
    //Area of Rectangle
    public static double area(double side1, double side2){
        if(side1>=0 && side2>=0){ // Area of Square
            return side1 * side2;
        }else{
            return -1;
        }
    }
}
