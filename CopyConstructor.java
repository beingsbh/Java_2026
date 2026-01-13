
class Addition {

    int a;
    int b;

    Addition(int x, int y) {

        a = x;
        b = y;

    }

    Addition(Addition s) {

        a = s.a;
        b = s.b;

    }

    int display() {

        return a + b;

    }
}

public class CopyConstructor {

    public static void main(String[] args) {
        Addition obj = new Addition(101, 303);
        Addition obj2 = new Addition(obj);

        System.out.println(
                obj.display());
        System.out.println(obj2.display());

    }

}
