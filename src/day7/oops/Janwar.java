package day7.oops;

//interface Animal

abstract class Animal {
    public abstract String sound();

}

class dog extends Janwar{
    public String sound(){
        return "bark";
    }
}

class cat extends Janwar{
    public String sound(){
        return "meow";

    }

}

public class Janwar {
    public static void main (String args[]){
        dog d=new dog();
        cat c=new cat();
        System.out.println(c.sound());




    }
}
