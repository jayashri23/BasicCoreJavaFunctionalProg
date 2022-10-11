package basiccoreprog;

import java.util.Scanner;

public class factor {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int div = 2; div < n; div++)
        {
            while (n % div == 0)
            {
                System.out.println(div + "");
                n = n / div;
            }
        }
        if (n != 1)
            System.out.println(n);
    }
}