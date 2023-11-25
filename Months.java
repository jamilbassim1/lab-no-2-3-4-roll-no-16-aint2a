import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of month in numbers(1-12)");
        int num = s.nextInt();
        String monthname = "";
        if (num >= 1 && num <= 12) {
           
            switch (num) {
                case 1:
                monthname = "january";
                    
                    break;
                     case 2:
                monthname = "february";
                    
                    break;
                     case 3:
                monthname = "march";
                    
                    break;
                     case 4:
                monthname = "april";
                    
                    break;
                     case 5:
                monthname = "may";
                    
                    break;
                     case 6:
                monthname = "june";
                    
                    break;
                     case 7:
                monthname = "july";
                    
                    break;
                     case 8:
                monthname = "august";
                    
                    break;
                     case 9:
                monthname = "september";
                    
                    break;
                     case 10:
                monthname = "october";
                    
                    break;
                     case 11:
                         monthname = "november";
                    
                    break;
                     case 12:
                monthname = "december";
                    
                    break;

            
                
            }
            System.out.println("the name of month is : " + monthname);

        }else{
            System.out.println("invalid input type number (1-2)");
        }
    }
    
}
