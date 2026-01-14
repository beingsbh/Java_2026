// Ocnstructor Overloading

class Student {

    int age;
    int id;
    String name;

    Student(int a, int i) {

        age = a;
        id = i;
    }

    Student(int a, int i, String n) {

        age = a;
        id = i;
        name = n;
    }

    Student() {

    }

    void display() {
        System.out.println("My Name is " + name + " My Id Is " + id + " and I am " + age + " years old");
    }

}

public class CopyConstructor2 {

    public static void main(String[] args) {

        Student obj = new Student(22, 101, "Subha");
        Student obj2 = new Student(12, 105);
        Student obj4 = new Student();
        obj.display();
        obj2.display();
        obj4.display();
    }

}
