// check sign of two numbers using bitwise operator
// in negation there is extra 1 in the most significant bit
public class check_sign {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        int res=a^b;
        if (res>0) {
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        } 
    }
} 
