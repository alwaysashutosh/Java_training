package day1;

import java.util.Scanner;

public class MsbBitwise {
    public static void main(String[] args) {

        // Write a code to find MSB POSITION of number using bitwise
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int ans=0;
        while (num > 1){
            ans++;
            num>>=1;
        }
        System.out.println("MSB ---> "+ ans);
    }
}
