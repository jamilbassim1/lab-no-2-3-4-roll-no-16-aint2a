import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting year (>1000)");
        int start = s.nextInt();
        if (start <= 1000) {
            System.out.println("invalid ");
            
            return;

        }
        System.out.println("Enter the ending year");
        int end = s.nextInt();
        if (end <= start) {
            System.out.println("Invalid");
        
            return;

        }
        for (int year = start; year <= end; year++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println( "Leap years are : "+ year);
            }
          }
    }
}
