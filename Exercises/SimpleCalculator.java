package Exercises;

//OOP Class concept;
//Please refer SimpleCalculator.txt for problem statement.
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //Setter
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    //Getter
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public double getAdditionResult(){
        return this.firstNumber + this.secondNumber;
    }
    public double getSubtractionResult(){
        return this.firstNumber - this.secondNumber;
    }
    public double getMultiplicationResult(){
        return this.firstNumber * this.secondNumber;
    }
    public double getDivisionResult(){
        if(this.secondNumber == 0){
            return 0;
        }else {
            return this.firstNumber / this.secondNumber;
        }
    }

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+ calculator.getAdditionResult());
        System.out.println("sub= "+ calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= "+ calculator.getMultiplicationResult());
        System.out.println("divide= "+ calculator.getDivisionResult());
    }
}
