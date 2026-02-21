
class Athis {

    Athis getThis(String x) {
        return this;
    }

}

public class ThisPrac {

    public static void main(String[] args) {

        Athis a = new Athis();
        String x = "Value";
        a.getThis(x);

    }

}
