
// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found

package Challanges;

public class SwitchCaseChallenge {
    public static void main(String[]args){
        char switchvalue = 'z';
        switch (switchvalue){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found "+switchvalue);
                break;
            default:
                System.out.println("not found!");
                break;
        }
    }
}
