package day6;

public class ExceptionalHandle {
    public static <InputMisMatchException> void main(String[] args) {
        int a = 0;
        try{
            a/=a;
        }catch(ArithmeticException e){
            System.out.println("Arthimethic Error"+ e.getMessage());
        }
        int [] arr={1,2,3,4,5};
        try{
            int c=arr[arr.length];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Error"+ e.getMessage());
        }

    }
}
