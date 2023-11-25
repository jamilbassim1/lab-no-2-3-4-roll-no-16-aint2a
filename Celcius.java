import java.util.Scanner;

public class Celcius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value in celcius");
        float celcius = s.nextFloat();
        float faren = (celcius * 9 / 5) + 32;
        System.out.println("celcius to farenhite is : " + faren);
    }

}
//last q first slide 
