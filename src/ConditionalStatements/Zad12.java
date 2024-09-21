package ConditionalStatements;

/*
Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

Test Data
Input the 5 numbers : 1 2 3 4 5
Expected Output :

Input the 5 numbers :
1
2
3
4
5
The sum of 5 numbers is : 15
The Average is : 3.0
*/

import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("The sum of 5 numbers is: " + (a+b+c+d+e));
        System.out.println("The average is: " + (a+b+c+d+e) / 5);
    }
}
