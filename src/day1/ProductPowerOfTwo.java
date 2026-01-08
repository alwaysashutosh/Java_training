package day1;

import java.util.Scanner;

public class ProductPowerOfTwo {
    public static void main(String[] args) {

        // Write a code to find Product of Number having Power of 2 using bitwise operation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product number: ");
        int product = sc.nextInt();
        System.out.println("Enter power of two: ");
        int power = sc.nextInt();
        System.out.println(product >> power);
    }
}
