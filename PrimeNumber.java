package homeAssignment;

public class PrimeNumber {
	
	public static void main(String[] args) {
        int number = 12; // Number to check for primality

        boolean isPrime = true; // Assume the number is prime initially

        // Check if the number is less than 2
        if (number < 2) {
            isPrime = false;
        } else {
            // Loop through potential factors from 2 to half of the number
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by any other number, it's not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // No need to continue checking
                }
            }
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
