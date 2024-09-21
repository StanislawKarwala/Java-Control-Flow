package ConditionalStatements;

/*
Write a Java program that accepts two floating point numbers and checks whether they are the same up to two decimal places.

Test Data
Input first floating point number: 1235
Input second floating point number: 2534
Expected Output :

These numbers are different.
*/

import java.util.Scanner;

public class Zad32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first floating point number: ");
        double a = sc.nextDouble();
        System.out.println("Enter second floating point number: ");
        double b = sc.nextDouble();

        if(Math.abs(a - b) <= 0.01){
            System.out.println("These numbers are the same");
        } else{
            System.out.println("These numbers are different");
        }
    }
}
