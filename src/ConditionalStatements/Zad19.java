package ConditionalStatements;

/*
Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
       1
      2 2
     3 3 3
    4 4 4 4
*/

public class Zad19 {
    public static void main(String[] args) {
        int number = 4;
        int s = number + 4 - 1;

        for(int i = 1; i <= number; i++){
            for(int j = s; j != 0; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print(i + " ");
            }
            System.out.println();
            s--;
        }
    }
}
