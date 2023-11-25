import java.util.Scanner;
public class Pass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the score of 3 sunject out of hundered");

        System.out.print("Subject 1: ");
        int subject1 = s.nextInt();

        System.out.print("Subject 2: ");
        int subject2 = s.nextInt();

        System.out.print("Subject 3: ");
        int subject3 = s.nextInt();

        double average = (subject1 + subject2 + subject3) / 3;
        if (average >= 50) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
