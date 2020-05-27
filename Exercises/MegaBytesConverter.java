package Exercises;

//Read MegaBytesConverter.txt for problem statement

public class MegaBytesConverter {
//    public static void main(String[] args){
//        int kiloBytes = 5000;
//        printMegaBytesAndKiloBytes(kiloBytes);
//    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int megaBytes = kiloBytes / 1024;
        int KiloBytes = kiloBytes % 1024;
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+KiloBytes+" KB");
        }
    }
}
