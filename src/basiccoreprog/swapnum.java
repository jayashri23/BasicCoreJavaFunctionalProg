package basiccoreprog;

import java.util.Scanner;

public class swapnum {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number a= ");
        int a =sc.nextInt();

        System.out.println("Enter the number b= ");
        int b =sc.nextInt();

        int temp =a;
        a=b;
        b=temp;
        System.out.println("Swap  a  = " +a);
        System.out.println("Swap  b = " +b);
    }
}
