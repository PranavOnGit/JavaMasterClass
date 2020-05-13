package Casting;
public class CastingValues {

    public static void main(String[] args){

        byte ByteValue = 123;
        byte MyNewByteValue = (byte) (ByteValue / 2); // Casting Whole number
        System.out.println("Casted Byte Value = "+MyNewByteValue);

        short ShortValue = 1234;
        short MyShortValue = (short) (ShortValue/2);
        System.out.println("Casted Short Value = "+MyShortValue);
    }
}

