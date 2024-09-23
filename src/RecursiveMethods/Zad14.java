package RecursiveMethods;

/*
Write a Java recursive method to find the sum of the digits of a given integer.
*/

public class Zad14 {
    public static int sumOfDigits(int number){
        if(number < 10){
            return number;
        }
        int lastDigit = number % 10;

        return lastDigit + sumOfDigits(number / 10);
    }

    public static void main(String[] args) {
        int a = 99;
        System.out.println("Integer: " + a);
        System.out.println("Sum of the digits: " + sumOfDigits(a));
    }
}
