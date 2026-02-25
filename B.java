
class A {

    Object print() {
        System.out.println("Run in class A");
        return this;
    }
}

public class B extends A {
    @Override

    Integer print() {
        System.out.println("Run In class B");
        return 1;
    }

    public static void main(String[] args) {
        A obj = new B();
        obj.print();
        B obj2 = new B();
        obj2.print();

    }
}
