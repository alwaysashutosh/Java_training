package day1;

import java.util.Scanner;

public class SwapNum {
    public static void main(String[] args) {

        // Swap Two Number using Bitwise Operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.close();
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("First Number After Swap: " +num1);
        System.out.println("Second Number After Swap: " +num2);
    }
}
