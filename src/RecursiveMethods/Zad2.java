package RecursiveMethods;

/*
Write a Java recursive method to calculate the sum of all numbers from 1 to n.
*/

public class Zad2 {
    public static int calculateSum(int num){
        if(num == 1)
        {
            return 1;
        }
        return num + calculateSum(num - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of numbers from 1 to " + n + " is: " + calculateSum(n));
    }
}
