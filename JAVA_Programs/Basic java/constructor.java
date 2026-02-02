public class constructor {

    int valuel;
    
    int value2;
    
    constructor()
    
    {
    
    valuel = 10;
    
    value2 = 20;
    
    }
    
    constructor (int a)
    
    {
    
    valuel = value2 * a;
    
    }
    
    constructor (int a, int b)
    
    {
    
    valuel = a;
    
    value2= b;
    
    }
    
    void display()
    
    {
    
    System.out.println("Valuel = "+valuel);
    
    System.out.println("Value2 = "+value2);
    
    }
    
    }
    
    class Slip4
    
    {
    
    public static void main(String args[])
    
    {
    
    constructor d1 = new constructor();
    
    constructor d2 = new constructor (10);
    
    constructor d3 = new constructor (30,40);
        
    d1.display();
    d2.display();
    d3.display();
    }
    }