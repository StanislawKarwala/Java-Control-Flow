package ConditionalStatements;

/*
Write a Java program to find the number of days in a month.

Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days
*/

import java.util.Scanner;

public class Zad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month number: ");
        int month = sc.nextInt();
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        int daysInMonth = 0;
        String monthName = "";
        switch(month){
            case 1:
                daysInMonth = 31;
                monthName = "January";
                break;
            case 2:
                if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
                    monthName = "February";
                    daysInMonth = 29;
                } else{
                    monthName = "February";
                    daysInMonth = 28;
                }
                break;
            case 3:
                daysInMonth = 31;
                monthName = "March";
                break;
            case 4:
                daysInMonth = 30;
                monthName = "April";
                break;
            case 5:
                daysInMonth = 31;
                monthName = "May";
                break;
            case 6:
                daysInMonth = 30;
                monthName = "June";
                break;
            case 7:
                daysInMonth = 31;
                monthName = "July";
                break;
            case 8:
                daysInMonth = 31;
                monthName = "August";
                break;
            case 9:
                daysInMonth = 30;
                monthName = "September";
                break;
            case 10:
                daysInMonth = 31;
                monthName = "October";
                break;
            case 11:
                daysInMonth = 30;
                monthName = "November";
                break;
            case 12:
                daysInMonth = 31;
                monthName = "December";
                break;
        }
        System.out.println(monthName + " " + year + " has " + daysInMonth + " days");
    }
}
