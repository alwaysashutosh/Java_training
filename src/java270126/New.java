package java270126;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        String mother_toungue="Hindi";
        // length of string
        System.out.println("length of string is " + mother_toungue.length());
        //print mother toungue first letter
        System.out.println(mother_toungue.charAt(0));

        // print mother toungue first letter twice
        for (int i =0; i<mother_toungue.length() ; i++){
            if (i==0){
                System.out.println(mother_toungue.charAt(i) + mother_toungue);
            }
            
        }

        //reverse a string in a single line
        System.out.println(new StringBuilder(mother_toungue).reverse().toString());

        //accept a string from user and check for anagram
        System.out.println("enter String to check anagram");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2= new StringBuilder(str1).reverse().toString();


        if (str1.equals(str2)){
            System.out.println("anagram");
        }else {
            System.out.println("not a anagram");
        }

        java.util.function.Function<String, Integer> lengthLambda = s -> s.length();
        java.util.function.UnaryOperator<String> upperLambda = s -> s.toUpperCase();
        java.util.function.Predicate<Integer> evenLambda = n -> n % 2 == 0;

        System.out.println("Length via lambda: " + lengthLambda.apply(mother_toungue));
        System.out.println("Uppercase via lambda: " + upperLambda.apply(mother_toungue));
        System.out.println("is 10 even? " + evenLambda.test(10));



        

        
    }


}
