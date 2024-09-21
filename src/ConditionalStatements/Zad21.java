package ConditionalStatements;

/*
Write a Java program to display the pattern like a diamond.

Test Data
Input number of rows (half of the diamond) : 7
Expected Output :


      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *

Click me to see the solution
*/

import java.util.Scanner;

public class Zad21 {
    public static void main(String[] args) {
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = rows -1; i >= 1; i--)
        {
            for(int j = 1; j <= rows - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
