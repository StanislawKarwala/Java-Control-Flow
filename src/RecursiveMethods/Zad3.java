package RecursiveMethods;

/*
Write a Java recursive method to calculate the nth Fibonacci number.
*/

public class Zad3 {
    public static int calculateFibbonaci(int num){
        if(num == 0){
            return 0;
        } else if(num == 1){
            return 1;
        }
        return calculateFibbonaci(num - 1) + calculateFibbonaci(num - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(n + "th Fibbonaci number equals: " + calculateFibbonaci(n));
    }
}
