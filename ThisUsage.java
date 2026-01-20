
class Student {

    int rollno;
    String course, name;
    float fee;

    Student(int rollno, String course, String name) {

        this.rollno = rollno;
        this.course = course;
        this.name = name;

    }

    Student(int rollno, String course, String name, float fee) {

        this(rollno, course, name);
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + course + " " + name + " " + fee);
    }

}

public class ThisUsage {

    public static void main(String[] args) {

        Student a = new Student(101, "BCA", "SUbhankar");
        Student b = new Student(202, "MCA", "Subhankar,2000.3213");
        a.display();
        b.display();
    }

}
