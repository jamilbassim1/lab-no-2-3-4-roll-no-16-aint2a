import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int evenc = 0;
        int oddc = 0;

        System.out.println("Enter 10 values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Value " + (i + 1) + ": ");
            int value = s.nextInt();

            if (value % 2 == 0) {
                evenc++;
            } else if (value % 2 != 0) {
                oddc++;
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Number of even numbers: " + evenc);
        System.out.println("Number of odd numbers: " + oddc);

        // Close the scanner to avoid resource leak
        s.close();
    }
}
