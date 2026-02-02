// toggle n'th bit of a number using bitwise operator

public class toggle_bits {
    public static void main(String[] args) {
        int num=25;
        int n=2;
        int i=0;
        int copy=1;
        while (i<n) {
            copy=copy<<1;
            i++;
        }
        int res=num^copy;
        System.out.println(res);
    }
}
