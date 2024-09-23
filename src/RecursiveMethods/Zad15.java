package RecursiveMethods;

/*
Write a Java recursive method to check if a given array is sorted in ascending order.
*/

import java.util.Arrays;

public class Zad15 {
    public static boolean isAscending(int[] array, int index){
        if (index == array.length - 1) {
            return true;
        }
        if (array[index] > array[index + 1]) {
            return false;
        }
        return isAscending(array, index + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 3 , 4, 5, 6 , 18, 23, 25};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Is the array sorted in ascending order? " + isAscending(array, 0));
    }
}
