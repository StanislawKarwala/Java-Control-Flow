package RecursiveMethods;

/*
Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
*/

// EuclidsAlgorithm
public class Zad7 {
    public static int greatestCommonDivisor(int a, int b){
        if(b == 0){
            return a;
        }
        return greatestCommonDivisor(b, a % b);
    }

    public static void main(String[] args) {
        int a = 16;
        int b = 176;
        System.out.println(greatestCommonDivisor(a, b));
    }
}
