package RecursiveMethods;

/*
Write a Java recursive method to find the maximum element in an array.
*/

import java.util.Arrays;

public class Zad12 {
    public static int maxElement(int[] array, int index){
        if(array.length == index){
            return 0;
        }
        return Math.max(array[index], maxElement(array, index + 1));
    }

    public static void main(String[] args) {
        int[] array = {1, 0 , 4, 5, 2 , 18, 23, 11};
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Maximum element: " + maxElement(array, 0));
    }
}
