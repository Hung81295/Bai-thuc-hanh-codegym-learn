package dayofmonth;

import java.util.Scanner;

public class DayOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = sc.nextInt();
        String daysInMonth;
        switch (month) {
            case 2:
                System.out.println("The month '2' has 28 or 29 days!");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("The month " + month + " has 31 days in this month!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("The month " + month + " has 30 days in this month!");
                break;
            default:
                System.out.print("Invalid input!");
                break;
        }
    }
}
