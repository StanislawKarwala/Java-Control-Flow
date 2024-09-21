package ConditionalStatements;

/*
Write a Java program that reads an integer and check whether it is negative, zero, or positive.

Test Data
Input a number: 7
Expected Output :

Number is positive
*/

import java.util.Scanner;

public class Zad27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if(number < 0){
            System.out.println("Number is negative");
        } else if(number > 0){
            System.out.println("Number is positive");
        } else{
            System.out.println("Number is zero");
        }
    }
}
