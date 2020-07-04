package Control_Flow_Statements;

public class SwitchStatement {
    public static void main(String[] args){

        int switchvalue = 7;//Byte, Short, Char, Int Can be used in Switch

        switch (switchvalue){
            case 1:
                System.out.println("this is number 1");
                break;
            case 2:
                System.out.println("this is number 2");
                break;
            case 3: case 4: case 5:
                System.out.println("this number may be 3, 4 or 5");
                break;
            case 6: case 7: case 8:
                System.out.println("this number is "+switchvalue);
                break;
            default:
                System.out.println("NA");
                break;// If there is no break, code will work fine. but it's recommended to add it.
        }
    }
}

