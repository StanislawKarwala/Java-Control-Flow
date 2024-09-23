package RecursiveMethods;

/*
Write a Java recursive method to find the sum of all odd numbers in an array.
*/

import java.util.Arrays;

public class Zad9 {
    public static int oddSum(int[] array, int index){
        if(array.length == index){
            return 0;
        }

        int sum = oddSum(array, index + 1);
        if(array[index] % 2 != 0){
            sum += array[index];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = oddSum(array, 0);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Sum of all odd numbers in this array: " + count);
    }
}
