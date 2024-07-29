import java.util.Scanner;

public class PrimeChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Handle edge cases
        if (number <= 1) {
            return false;
        }
        
        // Check divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test the isPrime method with different numbers
       // int[] testNumbers = {1, 2, 3, 4, 16, 17, 18, 19, 20};
       int   count=0;
       Scanner s=new Scanner(System.in);
       System.out.println("enter the numbers:");
       int testNumbers=s.nextInt();
        for (int number=0;number<=testNumbers;number++) {
            if (isPrime(number)) {
                count++;
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        System.out.println("total prime number count is "+count);
    }
}
