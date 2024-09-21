package ConditionalStatements;

/*
Write a Java program to print Floyd's Triangle.

Test Data
Input number of rows : 5
Expected Output :

Input number of rows :  5
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int number = sc.nextInt();
        int k = 1;

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
