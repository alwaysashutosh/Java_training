package day7.oops;

abstract class Train {

    public abstract String speed();
}

class PassengerTrain extends Train {
    public String speed() {
        return "120 KMPH";
    }
}


class GoodsTrain extends Train {
    public String speed() {
        return "150 KMPH";
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Train t1 = new PassengerTrain(); // abstraction
        Train t2 = new GoodsTrain();     // abstraction

        System.out.println(t1.speed());
        System.out.println(t2.speed());
    }
}
