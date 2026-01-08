package day1;

import java.util.Scanner;

public class MakeNthBitOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of bit: ");
        int N = sc.nextInt();
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        sc.close();
        System.out.println(x | (1<<N-1));

    }
}
