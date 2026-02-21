
class Athis {

    Athis getThis() {
        return this;
    }

}

class ThisPrac {

    public static void main(String[] args) {

        Athis a = new Athis();
        // String x = "Value";
        a.getThis();

    }

}
