package Exercises;

// Read BarkingDog.txt for problem statement

public class BarkingDog {
//    public static void main(String[] args){
//        System.out.println(shouldWakeUp(false, 6));
//    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // this function tels us if we need to wake up because our dog is currently barks.
        // we need to wake up if the dog barks before 8 or after 22. (return true)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if ((barking) && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        } else {
            return false;
        }
    }
}
