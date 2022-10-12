package functionalprogram;

//Desc -> A library for reading in 2D arrays of integers, doubles, or booleans from
//standard input and printing them out to standard output.
//b. I/P -> M rows, N Cols, and M * N inputs for 2D Array. Use Java Scanner Class
//c. Logic -> create 2 dimensional array in memory to read in M rows and N cols
//d. O/P -> Print function to print 2 Dimensional Array. In Java use PrintWriter with
//OutputStreamWriter to print the output to the screen.

import java.util.Scanner;

public class twodayarray {

    public static void main(String[] args) {
        System.out.println("Enter the number for rows and colum :");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();

        int[][] number = new int[row][colum];

        //input
        //row control
        for (int i = 0; i < row; i++) {
            //colum control
            for (int j = 0; j < colum; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}