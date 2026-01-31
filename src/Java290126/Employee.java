package Java290126;

public class Employee {
    int id;
    String name;
    float salary;
    transient String password;

    public Employee(int id, String name, float salary, String password) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", password='" + password + '\'' +
                '}';
    }

    public String getPassword() {
        return password;
    }

    public Employee() {


    }

//    public static void main(String[] args){
//        Employee e1=new Employee(101,"Samir",67000,"password");
//        try (ObjectOutputStream out =new ObjectOutputStream(
//                new FileOutputStream("src/Java290626/input.txt"))
//        )){
//
//        }
//
//    }
}
