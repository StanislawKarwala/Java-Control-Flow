package RecursiveMethods;

/*
Write a Java recursive method to calculate the factorial of a given positive integer.
*/

public class Zad1 {
    public static int calculateFactorial(int num){
        if(num < 1){
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + calculateFactorial(n));
    }
}
