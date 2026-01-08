package day1;

import java.util.Scanner;

public class RemoveNthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the bit position to remove: ");
        int n = sc.nextInt();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int mask = ~(1 << (n - 1));
        int result = num & mask;

        System.out.println("Result after removing " + n + "th bit: " + result);
    }
}
