package Exercises;

//Read SpeedConverter.txt for problem statement

public class SpeedConverter {
    //kiloMeterPerHour
    public static long toMilesPerHour(double kiloMeterPerHour){
        if(kiloMeterPerHour < 0){
            return -1;
        }else{
            return Math.round( kiloMeterPerHour / 1.609);
        }
    }

    //kiloMeterPerHour
    public static void printConversion(double kiloMeterPerHour){
        toMilesPerHour(kiloMeterPerHour);
        if(kiloMeterPerHour < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloMeterPerHour+" km/h = "+Math.round(toMilesPerHour(kiloMeterPerHour))+" mi/h");
        }
    }
}
