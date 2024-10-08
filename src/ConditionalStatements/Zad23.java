package ConditionalStatements;

/*
Write a Java program to generate the following * triangles.

Test Data
Input the number: 6
Expected Output :

******
 *****
  ****
   ***
    **
     *
*/

import java.util.Scanner;

public class Zad23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();

        for(int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

