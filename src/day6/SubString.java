package day6;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The substring is: ");
        for (int i = 0; i < s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                System.out.println((j-i) + " ---> "+ s.substring(i, j));
            }
            System.out.println("-----------------------------------------");
        }
    }
}
