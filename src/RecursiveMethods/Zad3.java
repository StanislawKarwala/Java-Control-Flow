package RecursiveMethods;

/*
Write a Java recursive method to calculate the nth Fibonacci number.
*/

public class Zad3 {
    public static int calculateFibbonaci(int number){
        if(number == 0){
            return 0;
        } else if(number == 1){
            return 1;
        }

        return calculateFibbonaci(number - 1) + calculateFibbonaci(number - 2);

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + "th Fibbonaci number equals: " + calculateFibbonaci(n));
    }
}
