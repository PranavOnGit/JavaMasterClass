package methods;

public class ReturnTypeMethod {
    public static void main(String[] args){
        boolean isTaller = isTaller(true, 6); //Method

        System.out.println("IsTaller: "+isTaller);
    }

    public static boolean isTaller( boolean taller, int height){
        if(height >= 6 )
            return true;
        else
            return false;
    }
}
