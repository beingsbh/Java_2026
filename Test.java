
class A {

    A() {

        this("Sout");

        System.out.println("Called THe FIrst Constructor");
    }

    A(String x) {
        // this(2);
        System.out.println(x + 1);
        System.out.println("Second Constructor Calling" + x);

    }
}

public class Test {

    public static void main(String[] args) {

        A a = new A();

    }

}
