public class method {

    static int sum (int a, int b)
    
    {
    
    System.out.println("Program for method overloading."); System.out.println("Addition of two integers is:"); 
    return (a+b);
    
    }
    
    static int sum (int a, int b,int c)
    
    {
    
    System.out.println("addition of three integer values is:"); 
    return (a+b+c);
    
    }
    
    }
    
    class method_overloading {
    
    public static void main(String args[]) {
    
    System.out.println(method.sum(10,30));
    
    System.out.println(method.sum (10,40,20));
    
    }
    }