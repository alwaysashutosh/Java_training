package day12;

class TowerOfHanoi {
    static void solve(int n, char source, char middle, char destination) {
        // base c
        if (n == 1) {
            System.out.println("move disk 1 from " + source + " to " + destination);
            return;
        }
        solve(n - 1, source, destination, middle);
        System.out.println("move disk " + n + " from " + source + " to " + destination);
        solve(n - 1, middle, source, destination);
    }
    public static void main(String[] args) {
        int n = 10;
        solve(n, 'A', 'B', 'C');
    }
}
