package ConditionalStatements;

/*
Write a Java program that reads a floating-point number. If the number is zero it prints "zero",
otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is
less than 1, or "large" if it exceeds 1,000,000.

Test Data
Input a number: -2534
Expected Output :

Negative
*/

import java.util.Scanner;

public class Zad28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double number = sc.nextDouble();

        if(number > 0){
            if(number < 1){
                System.out.println("Positive small");
            } else if(number > 1000000){
                System.out.println("Positive large");
            } else{
                System.out.println("Positive");
            }
        } else if(number < 0) {
            if(Math.abs(number) < 1){
                System.out.println("Negative small");
            } else if(Math.abs(number) > 1000000){
                System.out.println("Negative large");
            } else{
                System.out.println("Negative");
            }
        } else{
            System.out.println("Zero");
        }

    }
}
