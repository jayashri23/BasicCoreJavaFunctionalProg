package basiccoreprog;

import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        int year;
        System.out.println("Enter the year:");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year > 999 && year <=9999) {
            if (year % 400 == 0) {

                System.out.println(year + "is  Leap year.");
            } else if (year % 100 != 0) {

                System.out.println(year + "is not leap year.");
            } else if (year % 4 == 0) {

                System.out.println(year + "is leap year.");
            }
        }
        System.out.println("Not four digit number");
    }
}