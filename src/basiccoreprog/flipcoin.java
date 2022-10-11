package basiccoreprog;

import java.util.Scanner;

public class flipcoin {
    public static void main(String [] args) {
        int NumnerOfHeads = 0;
        int NumberOfTails= 0;
        int Count = 1;
        double randum = 0.0;
        System.out.println("Enter the number:");
        Scanner n  = new Scanner(System.in);
        int Flips = n.nextInt();

        while (Count <= Flips) {

            randum = Math.random();
            System.out.println(Count+ "" + randum);

            if (randum < 0.5)
            {
                NumnerOfHeads++;
                System.out.println("Heads");
            }
            else
            {
                NumberOfTails++;
                System.out.println("Tails");
            }
            Count++;
        }
        System.out.println("Number of Heads=" +NumnerOfHeads);
        System.out.println("Number of Tails= " +NumberOfTails);
        double Head_Percentage=(double)NumnerOfHeads/Flips*100;
        double Tail_Percentage=(double)NumberOfTails/Flips*100;
        System.out.println("Percentage of head=" + Head_Percentage);
        System.out.println("Percentage of tail= " +Tail_Percentage);

    }
}
