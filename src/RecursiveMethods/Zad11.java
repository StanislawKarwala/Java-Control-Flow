package RecursiveMethods;

/*
Write a Java recursive method to generate all possible permutations of a given string.
*/

public class Zad11 {
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void permute(char[] array, int left, int right) {
        if (left == right) {
            System.out.println(String.valueOf(array));
        } else {
            for (int i = left; i <= right; i++) {
                swap(array, left, i);
                permute(array, left + 1, right);
                swap(array, left, i);
            }
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        char[] charArray = str.toCharArray();
        permute(charArray, 0, str.length() - 1);
    }
}

