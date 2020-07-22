package ParsingValuesFromString;

public class ParseInteger {

    public static void main(String[] args) {
        String numberString = "1223";
        //  String numberString = "1223a";  will leads to exception.
        System.out.println("numberString is "+numberString);

        int numberInt = Integer.parseInt(numberString);//Parsing String to INTEGER
        System.out.println("numberInt is "+numberInt);

        numberString += 1;
        numberInt += 1;

        System.out.println("numberString after adding 1"+ numberString);
        System.out.println("numberInt after adding 1"+ numberInt);
    }
}
