
//boilerplate code
import java.util.*;

public class StartJava {
    public static void main(String[] args) {
        System.out.println("Hello i am pythonist");
        System.out.println("i am drinking coffee");

        // variables and datatypes

        int age = 20; // 4 bytes
        int age2 = 30;
        double height = 5.6; // 8 bytes
        String name = "Ashutosh"; //
        System.out.println("My age is " + age);
        System.out.println("My height is " + height);
        System.out.println("My name is " + name);
        byte b = 127; // 1 byte
        System.out.println(b);
        boolean isJavaFun = true; // 1 byte
        System.out.println(isJavaFun);

        int sum = age + age2;
        System.out.println(sum);

        int radii = 5;
        double area = Math.PI * radii * radii;
        System.out.println(area);

        // input from user

        Scanner sc = new Scanner(System.in);
        /*
         * String name2 = sc.nextLine(); //input string //full string print
         * System.out.println(name2);
         * 
         * int age3 = sc.nextInt(); //input integer
         * System.out.println(age3);
         */

        // typecasting
        float f = 10.557f;
        int a = (int) f;
        System.out.println(a);

        char ch = 'A';
        char ch2 = 'b';
        System.out.println(ch + ch2);

        // Conditional statements

        sc.close();
    }
}
