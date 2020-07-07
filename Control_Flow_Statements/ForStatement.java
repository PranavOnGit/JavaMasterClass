package Control_Flow_Statements;

public class ForStatement {

    public static void main(String[]args){
        //        System.out.println("10,000 at 2% interest rate: "+calculateInterest(10000.0, 2.0));
        //        System.out.println("10,000 at 3% interest rate: "+calculateInterest(10000.0, 3.0));
        //        System.out.println("10,000 at 4% interest rate: "+calculateInterest(10000.0, 4.0));
        //        System.out.println("10,000 at 5% interest rate: "+calculateInterest(10000.0, 5.0));

        //[1]
        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
        for(int i = 2; i<=8; i++){
            System.out.println("10,000 at "+i+"% interest rate: "+calculateInterest(10000.0, i));
        }

        //[2]
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
        System.out.println();
        for (int i = 8; i>=2; i--){
            System.out.println("10,000 at "+i+"% interest rate: "+calculateInterest(10000.0, i));
        }

        //[3]
        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit
        System.out.println();
        int cnt = 1;
        for(int i=1; i<10; i++){
            if(isPrime(i)){
                System.out.println(i);
                if(cnt == 3) {
                    System.out.println("Exiting the loop!");
                    break;
                }else {
                    cnt++;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for (int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
