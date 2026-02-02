//find most significant bit of a number using bitwise operator

public class most_signi_bit {
    public static void main(String[] args) {
        int n=5;
        int msb=0;
        while (n>0) {
            n=n>>1;
            msb++;
        }
        System.out.println(msb);
    }
}
