package ConditionalStatements;

/*
Write a Java program to solve quadratic equations (use if, else if and else).

Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195
*/

public class Zad2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 1;

        double delta = (b * b) - (4 * a * c);
        if(delta > 0){
            double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.println("The roots are " + r1 + " and " + r2);
        } else if(delta == 0){
            double r1 = -b / (2 * a);
            System.out.println("Root is " + r1);
        } else{
            System.out.println("Roots are not real.");
        }

    }
}
