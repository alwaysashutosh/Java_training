public class clear_nth_bit {
    public static void main(String[] args) {
        int a = 25;
        int c = 3;  // position of bit to clear
        int b = 1 << c;
        int result = a & (~b);
        System.out.println(result);
    }
}
