
class Person {

    String name;
    int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;

    }

}

class Employee extends Person {

    float salary;

    public Employee(String name, int id, float salary) {
        super(name, id);
        this.salary = salary;
    }

    void empDetailes() {
        System.out.println(id + " , " + name + " , " + salary);
    }

}

public class UseOfSuper {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Subha", 1, 100000f);
        emp1.empDetailes();
    }

}
