
class Student {

    int rollNumber;
    String name;
    static String college = "PBC";

    static void change() {
        college = "MCC";
    }

    public Student(int n, String x) {
        rollNumber = n;
        name = x;

    }

    void display() {
        System.out.println(rollNumber + " " + name + " " + college);
    }

}

public class StaticMethod {

    public static void main(String[] args) {
        Student.change();
        Student obj = new Student(111, "Subhankar");
        obj.display();
    }

}
