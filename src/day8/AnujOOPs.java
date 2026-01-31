package day8;

public class AnujOOPs {
    public static void main(String[] args){
        System.out.println("Hello World");
        Person p1=new Person();
        Person p2=new Person();
        p1.age=24;
        p1.name="Ashutosh";
        p2.age=23;
        p2.name="ar";
        System.out.println(p1.age+" "+p1.name);
        System.out.println(p2.age+" "+p2.name);

    }
}

class Person{
    String name;
    int age;

}


