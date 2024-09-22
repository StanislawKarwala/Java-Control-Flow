package RecursiveMethods;

/*
Write a Java recursive method to calculate the factorial of a given positive integer.
*/

public class Zad1 {
    public static int calculateFactorial(int number){
        if(number == 0){
            return 1;
        }
        return number * calculateFactorial(number - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
    }
}
