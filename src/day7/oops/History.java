package day7.oops;

abstract class India {

    public abstract String location();
}
class Pakistan extends India {

    public String location() { //common properties /gdp
        return "west of India";
    }
}
class Bangladesh extends India {

    public String location() {
        return "east of India";
    }
}
public class History {

    public static void main(String[] args) {

        India c1 = new Pakistan();
        India c2 = new Bangladesh();

        System.out.println(c1.location());
        System.out.println(c2.location());
    }
}
