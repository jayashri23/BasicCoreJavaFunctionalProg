package basiccoreprog;

import java.util.Scanner;

public class poweroftwo {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = 0;
        int PowerOfTwo = 1;
        if (0 < n && n < 31) {
            while (i <= n) {
                System.out.println(i + "-> " + PowerOfTwo);
                PowerOfTwo = 2 * PowerOfTwo;
                i = i + 1;
            }
        }else
        System.out.println("Overflows an integer .");
    }
}
