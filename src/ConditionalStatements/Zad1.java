package ConditionalStatements;

/*
Write a Java program to get a number from the user and print whether it is positive or negative.

Test Data
Input number: 35
Expected Output :
Number is positive
*/

import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int number = sc.nextInt();

        if(number > 0 ){
            System.out.println("Number is positive");
        } else if(number < 0){
            System.out.println("Number is negative");
        } else{
            System.out.println("Number is zero");
        }
    }
}
