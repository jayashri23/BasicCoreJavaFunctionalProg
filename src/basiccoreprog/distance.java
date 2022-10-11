package functionalprogram;

import java.util.Map;
import java.util.Scanner;

public class distance {
    public static void main(String [] args){
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        double Euclidean_distance = Math.sqrt(x*x+y*y);
        //output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + Euclidean_distance);

    }
}
