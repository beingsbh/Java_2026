
class Address {

    String city;
    String state;
    String country;

    public Address(String city, String state, String country) {

        this.city = city;
        this.state = state;
        this.country = country;
    }

}

class Employee {

    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {

        System.out.println("ID " + id + " \n" + "Name " + name + " \n" + "Address " + address.city);

    }
}

public class AggregationEmp {

    public static void main(String[] args) {
        Address ajayAdd = new Address("Panskura", "West Bengal", "India");
        Employee ajay = new Employee(101, "Pradip", ajayAdd);

        ajay.display();

    }

}
