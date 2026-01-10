package day2;

public class ConditionalQues {
    public static void main(String[] args) {

        int a=15;
        if((a%3 == 0) || (a%5 == 0)) System.out.println("Both");
        else if (a%3 == 0 && a%5 != 0) System.out.println("3");
        else if(a%5 == 0 && a%3 != 0) System.out.println("5");
        else System.out.println("None");
    }
}
