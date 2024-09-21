package ConditionalStatements;

/*
Write a Java program that requires the user to enter a single character from the alphabet.
Print Vowel or Consonant, depending on user input.
If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant
*/

import java.util.Scanner;

public class Zad8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter = sc.next().toLowerCase();

        boolean isUpperCaseRange = letter.charAt(0) >= 65 && letter.charAt(0) <= 90;
        boolean isLowerCaseRange = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;
        boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u") || letter.equals("y");

        if(letter.length() > 1){
            System.out.println("Error. Not a single letter.");
        } else if(!(isUpperCaseRange || isLowerCaseRange)){
            System.out.println("Error. Not a letter");
        } else if(vowels){
            System.out.println("Input letter is Vowel");
        } else{
            System.out.println("Input letter is Consonant");
        }
    }
}
