public class ReverseString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        String reversed = "";

        // Loop through the string from end to start
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
