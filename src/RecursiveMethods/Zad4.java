package RecursiveMethods;

/*
Write a Java recursive method to check if a given string is a palindrome.
*/

public class Zad4 {
    public static boolean isPalindrome(String word){
        if(word.length() <= 1){
            return true;
        }

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);

        if(firstChar != lastChar){
            return false;
        }

        String remainingSubstring = word.substring(1, word.length() - 1);
        return isPalindrome(remainingSubstring);
    }

    public static void main(String[] args) {
        String palindrome1 = "addda";
        boolean isPalindrome1 = isPalindrome(palindrome1);
        System.out.println(palindrome1 + " is a palindrome: " + isPalindrome1);
    }
}
