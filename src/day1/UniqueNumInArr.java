package day1;

public class UniqueNumInArr {
    public static void main(String[] args) {
        int [] arr = {8,8,9,9,10,11,11};
        int ans=arr[0];
        for(int i=1; i<arr.length; i++){
            ans^=arr[i];
        }
        System.out.println("Answer is: " + ans);
    }
}
