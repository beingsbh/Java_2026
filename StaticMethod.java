
class Student {

    int rollNumber;
    String name;
    static String college = "PBC";

    public static void change() {
        college = "MCC";
    }

    public Student(int n, String x) {
        rollNumber = n;
        name = x;

    }

    public void display() {
        System.out.println(rollNumber + " " + name + " " + college);
    }

}

public class StaticMethod {

    public static void main(String[] args) {
        Student obj = new Student(111, "Subhankar");
        obj.display();
    }

}
