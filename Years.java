import java.util.Scanner;

public class Years {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Years");
        float Years = s.nextFloat();

        float daysInYear = 365.55f;
        float daysinmonth = 30.44f;

        float totalDays = Years * daysInYear;
        float daysInMonth = (int) (totalDays / daysinmonth);
        System.out.println("total days in year : " + totalDays);
        System.out.println("total months in years : " + daysInMonth);

    }

}
//qno 4 firslt slide
