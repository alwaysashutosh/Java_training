package day12;

import java.util.Scanner;
import java.util.Stack;

public class stack {
    // word reverser
    public static void wordReverser( String input){

        Stack<Character> stack = new Stack<>();
        for (char c: input.toCharArray()){
            stack.push(c);
        }
        System.out.print("reversed>>>> ");
        while (!stack.isEmpty()){
            System.out.print(stack.pop());

        }
        System.out.println();


    }
    public static void main(String args[]){
        System.out.print("Enter a word : >>>> ");
        Scanner scanner= new Scanner(System.in);

        String input =scanner.nextLine();
        wordReverser(input);


    }
}
