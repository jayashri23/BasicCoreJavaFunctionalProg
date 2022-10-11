package basiccoreprog;

import java.util.Scanner;

public class findlargest {


    public static void main(String [] args){
        System.out.println("Enter num1:");
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        System.out.println("Enter num2:");
        int num2= sc.nextInt();
        System.out.println("Enter num3:");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(" Largest number  : " +num1 );
        }else if (num2 > num1 &&  num2 > num3)
        {
            System.out.println("Largest number : " +num2);
        } else if (num3 > num1 && num3 > num2 )
        {
            System.out.println("Largest number : " +num3);
        }
    }
}
