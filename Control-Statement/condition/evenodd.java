import java.util.Scanner;

public class evenodd{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();

        if(num1 % 2 == 0)
            System.out.println(num1 + " is even");
        else
            System.out.println(num1 + " is odd");
        if(num2 % 2 == 0)
            System.out.println(num2 + " is even");
        else
            System.out.println(num2 + " is odd");

        if(num1 > num2)
            System.out.println(num1 + "is greater");
        else
            System.out.println(num2 + " is greater");
    }
}