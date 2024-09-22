package RecursiveMethods;

/*
Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
*/

public class Zad5 {
    public static double calculateExponentiation(double base, int exponent){
        if(exponent == 0){
            return 1;
        }

        return base * calculateExponentiation(base, exponent - 1);
    }

    public static void main(String[] args) {
        double a = 5;
        int b = 3;
        System.out.println("Number " + a + " raised to " + b + " power is: " + calculateExponentiation(a, b));
    }
}
