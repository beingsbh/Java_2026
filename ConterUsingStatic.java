
class Counter {

    static int count = 0;

    Counter() {
        count++;
        System.out.println(count);

    }

}

public class ConterUsingStatic {

    public static void main(String[] args) {
        Counter obj = new Counter();
        Counter obj2 = new Counter();
    }

}
