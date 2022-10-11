package basiccoreprog;

import java.util.Scanner;

public class quotientandreminder {
    public static void main(String [] args){

        System.out.println("Enter num1:");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("Enter num2:");
        int num2= sc.nextInt();

        int quotient=num1/num2;
        int reminder= num1%num2;

        System.out.println("Quotient of given number is: "+quotient);
        System.out.println("Reminder of given number is: "+reminder);
    }

}
