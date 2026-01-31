package java280126;
import java.util.*;
class Employee{
    int id;
    String name;
    int salary;
    int age;
    public Employee(int id, String name, int salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
    }
    
}

public class SetandMap {
    public static void main(String[] args) {
     // store employee objects in a list and sort by , name , Salary , Age
     ArrayList<Employee> list = new ArrayList<Employee>();
     list.add(new Employee(1, "Ved", 1000, 25));
     list.add(new Employee(2, "Red", 2000, 30));
     list.add(new Employee(3, "Sed", 3000, 35));

     //remove duplicates from a set
     HashSet<Employee> set = new HashSet<Employee>();
     set.add(new Employee(1, "Ved", 1000, 25));
     set.add(new Employee(2, "Red", 2000, 30));
     set.add(new Employee(3, "Sed", 3000, 35));
     set.add(new Employee(1, "Ved", 1000, 25));
     System.out.println(set);

     //remove duplicates from a list

     

    }
}