package Assignment_VS_Equals_Operator;

public class AssignmentVsEquals {
    public static void main(String[] args){

        int isNum = 50;

        if(isNum == 50){
            System.out.println(" this is a number");
        }

        /*
            if(isNum = 50){ // throws error as we are assigning value to isNum
                System.out.println(" this is a number");
            }
        */

        boolean isNumT = false;
        if(isNumT = true){ // assign true to isNum so value is true and output is next line
            System.out.println(" this is a number");
        }

        if(isNumT){ // true
            System.out.println(" this is a number");
        }

        if(!isNumT){ // false [ ! = is NOT operator in java ]
            System.out.println(" this is a number");
        }

        if(isNumT == false){ // true so optput is next line
            System.out.println(" this is a number");
        }
    }
}
