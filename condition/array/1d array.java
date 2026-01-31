public class 1d array {
    public static void main(String[] args) {

        int[] numbers = { 10, 20, 30, 40, 50 };

        System.out.println("Original Array:");
        printArray(numbers);

        System.out.println("\nElement at index 2: " 
        + numbers[2]); 

        numbers[3] = 45;

        System.out.println("\nModified Array:");
        printArray(numbers);

        int sum = calculateSum(numbers);
        System.out.println("\nSum of elements in the array: " 
        + sum);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
