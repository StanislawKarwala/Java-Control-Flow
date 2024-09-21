package ConditionalStatements;

/*
Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.

Test Data
Input an integer number less than ten billion: 125463
Expected Output :

Number of digits in the number: 6
*/

import java.util.Scanner;

public class Zad29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number less than ten billion");
        int number = sc.nextInt();

        int digits = 0;
        if(number < 1000000000){
            while(number != 0){
                digits++;
                number /= 10;
            }
            System.out.println("Number of digits in the number: " + digits);
        } else{
            System.out.println("Number is bigger than ten billion!");
        }
    }
}
