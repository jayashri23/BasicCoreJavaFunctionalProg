package basiccoreprog;

import java.util.Scanner;

public class harmonic {


    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        double Harmonic_Number = 0.0;
        System.out.println("Harmonic Number:");

        for (int i = num; i > 0; i--) {
            //  formula--> Hn=H1+H2+H3.....Hn
            Harmonic_Number = Harmonic_Number + (double) 1 / i;
            System.out.println(Harmonic_Number + " ,");
        }
    }
}
