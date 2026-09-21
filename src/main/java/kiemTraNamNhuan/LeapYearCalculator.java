package kiemTraNamNhuan;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter the year:");
        year=input.nextInt();
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    System.out.println("%d is a leap year"+ year);
                }else {
                    System.out.printf("%d is NOT a leap year"+ year);

                }
            }else{
                System.out.printf("%d is a leap year"+ year);
            }
        }else {
            System.out.printf("%d is NOT a leap year"+ year);
        }
    }
}
