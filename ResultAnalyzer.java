
class Student {

    int id;
    int age;
    String name;
    int[] marks;
// Constructor

    Student() {

        id = -1;
        age = 0;
        name = "Unknown";
        marks = new int[5];

    }
    //Parameterized Constructor

    public Student(int i, int a, String n, int[] m) {
        id = i;
        name = n;

        if (a >= 5 && a <= 100) {
            age = a;
        } else {
            age = 0;
        }

        marks = new int[5];
        for (int x = 0; x < marks.length; x++) {
            if (m[x] >= 0 && m[x] <= 100) {
                marks[x] = m[x];
            } else {
                marks[x] = 0;
            }
        }

    }
    //Copy Constructor

    public Student(Student s) {
        id = s.id;
        name = s.name;
        age = s.age;
        marks = new int[5];
        marks = s.marks.clone();
    }
//Methods

    int totalMarks() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += marks[i];
        }
        return sum;
    }

    double avarageMarks() {
        double avg = totalMarks() / 5;
        return avg;
    }

    String marksGrade() {
        if (avarageMarks() >= 90) {
            return "A++ Grade";
        } else if (avarageMarks() >= 80 && avarageMarks() < 90) {
            return "B++";
        } else {
            return "Pass";
        }
    }

    void display() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("age : " + age);
        for (int m : marks) {
            System.out.println("Marks : " + m);
        }
        System.out.println("Total Number Is : " + totalMarks());
        System.out.println("Avarege Number Is : " + avarageMarks());
        System.out.println("Grade Is : " + marksGrade());

    }

}

public class ResultAnalyzer {
//Main

    public static void main(String[] args) {
        int[] m = new int[]{37, 38, 90, 43, 67};
        int[] x = new int[]{-12, -34, 0, -32, 90};
        int[] q = new int[]{90, 98, 89, 99, 88};

        Student s1 = new Student(101, 22, "SUBHA", m);
        Student s2 = new Student(1, 1, "Naren", x);
        Student s3 = new Student(07, 22, "Subhankar", q);

        s1.display();
        s2.display();
        s3.display();

    }
}
