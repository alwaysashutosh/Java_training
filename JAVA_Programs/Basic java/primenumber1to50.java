public class primenumber1to50 {
    public static void main(String[] args) {
        int i, j, flag;
        System.out.println("Prime numbers between 1 and 50 are: ");
        for (i = 1; i <= 50; i++) {
            if (i == 1 || i == 0)
                continue;
            flag = 1;
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }
    }
}
