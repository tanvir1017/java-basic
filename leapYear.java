import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        try (Scanner inputYear = new Scanner(System.in)) {
            System.out.println("Enter a year to check is it leap?");
            int year = inputYear.nextInt();
            if ((year % 4 == 0) && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is leap year");
            }
            else {
                System.out.println(year + " isn't leap year");
            }
        }

    }
}
