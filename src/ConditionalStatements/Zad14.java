package ConditionalStatements;

/*
Write a Java program to display the multiplication table of a given integer.

Test Data
Input the number (Table to be calculated) : Input number of terms : 5
Expected Output :

5 X 0 = 0
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
*/

import java.util.Scanner;

public class Zad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int number = sc.nextInt();

        for(int i = 0; i <= number; i++){
            System.out.printf("5 X %d = %d%n",i ,(5 * i));
        }

    }
}
