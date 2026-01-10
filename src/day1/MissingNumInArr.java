package day1;

public class MissingNumInArr {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7,8,9,10,11};
        int ans=0;
        for (int i = 1; i <=arr.length+1; i++) {
            ans ^= i;
        }

        for(int i=0; i<arr.length; i++){
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
