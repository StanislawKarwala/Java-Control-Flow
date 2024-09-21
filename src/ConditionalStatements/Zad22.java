package ConditionalStatements;

/*
Write a Java program to display Pascal's triangle.

Test Data
Input number of rows: 5
Expected Output :

Input number of rows: 5
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
*/

import java.util.Scanner;

public class Zad22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of rows: ");
        int rows = sc.nextInt();
        int[][] pascal = new int[rows][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
