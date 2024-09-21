package ConditionalStatements;

/*
Write a Java program to display Pascal's triangle.

Test Data
Input number of rows: 5
Expected Output :

Input number of rows: 5
      1
     1 1
    1 2 1
   1 3 3 1
  1 4 6 4 1
*/

public class Zad22 {
    public static void printPascal(int n)
    {
        for (int line = 1; line <= n; line++) {
            for (int j = 0; j <= n - line; j++) {

                // for left spacing
                System.out.print(" ");
            }

            // used to represent C(line, i)
            int C = 1;
            for (int i = 1; i <= line; i++) {

                // The first value in a line is always 1
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        printPascal(n);
    }
}
