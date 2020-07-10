package Control_Flow_Statements;

public class WhileDoWhileStatement {

    public static void main(String[]args){

        //Simple While loop
//        int count = 1;
//        while (count != 6){
//            System.out.println("Count is: "+count);
//            count++;
//        }

        //Simple While loop with break
//        System.out.println("\n While loop with break :");
//        int count1 = 1;
//        while (true){
//            if(count1 == 6){
//                break;
//            }
//            System.out.println("Count is: "+count1);
//            count1++;
//        }

        ////Simple do_While loop
//        int count2 = 1;
//        System.out.println("\n Do While loop :");
//        do{
//            System.out.println("count is: "+count2);
//            count2++;
//        }while (count2 != 6);

        int num = 4;
        int finishnum = 20;
        int cnt = 0;
        while (num <= finishnum){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }
            if(cnt == 5){break;}
            cnt++;
            System.out.println("Even Number :"+num);
        }
        System.out.println("Tot Even Numbers :"+cnt);
    }

    public static boolean isEvenNumber(int number){
        if( number % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

//[1]
// Create a method called isEvenNumber that takes a parameter of type int
// Its purpose is to determine if the argument passed to the method is
// an even number or not.
// return true if an even number, otherwise return false;

//[2]
// Modify the while code above
// Make it also record the total number of even numbers it has found
// and break once 5 are found
// and at the end, display the total number of even numbers found