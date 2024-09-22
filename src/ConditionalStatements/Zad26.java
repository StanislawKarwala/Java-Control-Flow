package ConditionalStatements;

/*
Write a Java program to display the following character rhombus structure.

Test Data
Input the number: 7
Expected Output :


      A
     ABA
    ABCBA
   ABCDCBA
  ABCDEDCBA
 ABCDEFEDCBA
ABCDEFGFEDCBA
 ABCDEFEDCBA
  ABCDEDCBA
   ABCDCBA
    ABCBA
     ABA
      A
*/

import java.util.Scanner;

public class Zad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            for(int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }

        for(int i = n - 1; i >= 1; i--){
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print((char)('A' + j - 1));
            }
            for(int j = i - 1; j >= 1; j--) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }
}
