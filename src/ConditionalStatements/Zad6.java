package ConditionalStatements;

/*
Write a Java program that reads two floating-point numbers
and tests whether they are the same up to three decimal places.

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different
*/

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating-point number");
        double a = sc.nextDouble();
        System.out.println("Enter floating-point number");
        double b = sc.nextDouble();

        a = Math.round(a * 1000) / 1000.0;
        b = Math.round(b * 1000) / 1000.0;

        if(a == b){
            System.out.println("They are same up to three decimal places");
        } else{
            System.out.println("They are different");
        }
    }
}
