package functionalprogram;

import java.util.Scanner;

public class Quadratic {
    public static void  main(String [] args){
        System.out.println("Enter the values of a,b,c :");
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

         double delta =b*b -4*a*c;
         double root1 = (-b + Math.sqrt(delta))/(2*a);

         double root2 = (-b - Math.sqrt(delta)) / (2*a);
         if (delta >0){
             System.out.println("Root1 of x = " +root1);
         }else
         System.out.println("Root2 of  x = "  +root2);
    }
}
