package RecursiveMethods;

/*
Write a Java recursive method to find the length of a given string.
*/

public class Zad10 {
    public static int findLength(String str){
        if(str.isEmpty()){
            return 0;
        }
        return 1 + findLength(str.substring(1));
    }

    public static void main(String[] args) {
        String word = "noobnobody";
        System.out.println("Length of " + word + " is: " + findLength(word));
    }
}
