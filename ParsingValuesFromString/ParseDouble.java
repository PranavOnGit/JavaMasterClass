package ParsingValuesFromString;

public class ParseDouble {
    public static void main(String[] args) {
        String numberString = "1223.123";
        //  String numberString = "1223a";  will leads to exception.
        System.out.println("numberString is "+numberString);

        double numberDouble = Double.parseDouble(numberString);//Parsing String to INTEGER
        System.out.println("numberDouble is "+numberDouble);

        numberString += 1;
        numberDouble += 1;

        System.out.println("numberString after adding 1"+ numberString);
        System.out.println("numberDouble after adding 1"+ numberDouble);
    }
}
