public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 0210 ;  // Change this number to test
        int originalNum = num;
        int sum = 0;

        // Count number of digits
        int digits = String.valueOf(num).length();

        // Calculate sum of digits raised to the power of 'digits'
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // Check if sum equals original number
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}
