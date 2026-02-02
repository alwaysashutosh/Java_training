
public class find_unique {
    public static void main(String[] args) {
        int arr[] = { 3,4,5,6,3,4,8,9 };
        int unique = 0;
        for (int i = 0;i<arr.length;i++) {
            unique = unique^arr[i];
        }
        System.out.println(unique);
    }

}
