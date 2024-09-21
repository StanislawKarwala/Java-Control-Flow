package ConditionalStatements;

/*
Write a Java program to generate the following @'s triangle.

Test Data
Input the number: 6
Expected Output :

      @
     @@
    @@@
   @@@@
  @@@@@
 @@@@@@
*/

import java.util.Scanner;

public class Zad24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = n - i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("@");
            }
            System.out.println();
        }


//        for (int i = 0; i < n; i++)
//        {
//            for (int spc = n - i; spc > 0; spc--)
//            {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++)
//            {
//                System.out.print("@");
//            }
//            System.out.println();
//        }
    }
}

