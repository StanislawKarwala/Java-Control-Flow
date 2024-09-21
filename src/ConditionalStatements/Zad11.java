package ConditionalStatements;

/*
Write a Java program to display n terms of natural numbers and their sum.

Test Data
Input the number: 2
Expected Output :

Input number:
2
The first n natural numbers are :
2
1
2
The Sum of Natural Number up to n terms :
23
*/

import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        System.out.println("The first " + number + " natural numbers are: ");
        int score = 0;
        for(int i = 1; i <= number; i++){
            System.out.println(i);
            score += i;
        }

        System.out.println("The sum of Natural Number up to n terms: ");
        System.out.println(score);
    }


}
