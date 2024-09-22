package RecursiveMethods;

/*
Write a Java recursive method to reverse a given string.
*/

public class Zad6 {
    public static String recursiveReverse(String word){
        if(word.isEmpty() || word.length() == 1){
            return word;
        }

        return recursiveReverse(word.substring(1)) + word.charAt(0);
    }

    public static void main(String[] args) {
        String input = "nobody";
        String reversed = recursiveReverse(input);
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
