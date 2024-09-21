package ConditionalStatements;

/*
Write a program that accepts three numbers from the user and prints "increasing" if the numbers are in increasing order,
"decreasing" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise.

Test Data
Input first number: 1524
Input second number: 2345
Input third number: 3321
Expected Output :

Increasing order
*/

import java.util.Scanner;

public class Zad31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if(a < b && b < c){
            System.out.println("Increasing order");
        } else if(a > b && b > c){
            System.out.println("Decreasing order");
        } else{
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
