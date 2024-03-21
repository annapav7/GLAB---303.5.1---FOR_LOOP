//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
Assignment Name: GLAB - 303.5.1 - For loop
Author: Pavlenko Anna
Date: 3/21/2024
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for (initialization; termination; increment) {
                            statement(s)
            }
         */

        System.out.println("Example 1: Display a Text Five Times: ");
        // Program to print a text 5 times
        int n1 = 5;
        // for loop:
        for (int i = 1; i <= n1; ++i) {
            System.out.println("Java is fun!");
        }
        System.out.println();

        System.out.println("Example 2: Display Sum of n Natural Numbers: ");
        int sum = 0;
        int n2 = 1000;
        // for loop
        for (int i = 1; i <= n2; ++i) {
            // body inside for loop
            sum += i;     // sum = sum + i
        }
        System.out.println("Sum = " + sum);


        System.out.println();

        System.out.println("Example 3: Palindrome: ");

        String original, reverse = ""; // Objects of String class

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1; i >= 0; i-- ){
            reverse = reverse + original.charAt(i);
            }

        if (original.equals(reverse)) {
            System.out.println("Entered string/number is a palindrome.");
        }else
        {
            System.out.println("Entered string/number isn't a palindrome.");
        }
        System.out.println();

        System.out.println("Example 4: Pyramid: ");
        // Example#1:
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
        System.out.println();
        System.out.println("Example#2:");

       // Example#2:
        for (int i = 10; i >= 0; i--) {
            for (int j = 10; j > i; j--) {
                System.out.print("  ");
            }
            for  (int j = i - 1; j > 0; j--) {
                System.out.print(j + " ");
            }
            for  (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Example#3:





    }
}