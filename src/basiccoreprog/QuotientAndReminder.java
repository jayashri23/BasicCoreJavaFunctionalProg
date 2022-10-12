package basiccoreprog;

import java.util.Scanner;

public class QuotientAndReminder {
    public  static void main(String [] args)
    {
        int a;
        int b;
        System.out.printf("Enter the Number a = ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.printf("Enter the Number b = ");
        b=sc.nextInt();
        int Quotient=a/b;
        int Reminder=a%b;
        System.out.println("Quotient = " +Quotient);
        System.out.println("Reminder = " +Reminder);

    }
}
