package Reference_Value_Type;
import java.util.Arrays;

//Concept: Reference type AND Value type
public class Main {
    public static void main(String[] args) {
        int first = 10 ;
        int second = first;

        System.out.println("First: "+first);//OP: 10
        System.out.println("Second: "+second);//OP: 10
        //second variable copies value of first variable hence both are having separate
        //memory location, size.
        //Hence VALUE TYPE

        int[] firstArray = new int[5];
        int[] secondArray = firstArray;

        System.out.println("First Array: "+ Arrays.toString(firstArray));
        System.out.println("Second Array: "+ Arrays.toString(secondArray));

        firstArray[0] = 1;
        //it will change value for both arrays as secondArray is referencing to same
        //firstArrays memo location.
        //hence REFERENCE TYPE
        System.out.println("Arrays after change value: ");
        System.out.println("First Array: "+Arrays.toString(firstArray));
        System.out.println("Second Array: "+Arrays.toString(secondArray));

        //if we assign new allocation using 'new'
        //keyword then both will have separate memo location
        secondArray = new int[] {1, 3, 4, 2, 4, 4};
        System.out.println("Arrays after using 'new' keyword: ");
        System.out.println("First Array: "+Arrays.toString(firstArray));
        System.out.println("Second Array: "+Arrays.toString(secondArray));
    }
}
