
class CheckOver {

    public void add(long a, long b) {
        System.out.println("Long Calling");
    }

    public void add(int a, int b) {
        System.out.println("Int Calling");
    }
}

public class MethodOverloading {

    public static void main(String[] args) {

        CheckOver obj = new CheckOver();

        obj.add(40      , 4721);

    }

}
