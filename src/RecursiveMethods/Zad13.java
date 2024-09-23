package RecursiveMethods;

/*
Write a Java recursive method to calculate the product of all numbers in an array.
*/

import java.util.Arrays;

public class Zad13 {
    public static int arrayProduct(int[] array, int index){
        if(array.length == index){
            return 1;
        }
        return array[index] * arrayProduct(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 5, 3, 1};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Product of all numbers: " + arrayProduct(array, 0));
    }
}
