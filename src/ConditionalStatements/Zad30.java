package ConditionalStatements;

/*
Write a Java program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
"All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

Test Data
Input first number: 2564
Input second number: 3526
Input third number: 2456
Expected Output :

All numbers are different
*/

import java.util.Scanner;

public class Zad30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        if(a == b && a == c){
            System.out.println("All numbers are equal");
        } else if(a != b && a != c){
            System.out.println("All numbers are different");
        } else{
            System.out.println("Neither all are equal or different");
        }
    }
}
