package RecursiveMethods;

/*
Write a Java recursive method to count the number of occurrences of a specific element in an array.
*/

import java.util.Arrays;

public class Zad8 {
    public static int countOccurences(int[] array, int element, int index){
        if(index == array.length){
            return 0;
        }

        if(array[index] == element){
            return 1 + countOccurences(array, element, index + 1);
        } else{
            return countOccurences(array, element, index + 1);
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 3, 1};
        int element = 3;
        int count = countOccurences(array, element, 0);
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Occurrences of " + element + ": " + count);
    }
}
