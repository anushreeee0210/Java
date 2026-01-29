public class PrimeNumber{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check if num is divisible by any number from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Not a prime
                    break;           // No need to check further
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
