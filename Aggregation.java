
class Oparation {

    double squar(double n) {
        return n * n;
    }
}

class Circle {

    Oparation op;
    double pi = 3.14;

    double area(double radius) {
        op = new Oparation();
        double rsSquar = op.squar(radius);
        return pi * rsSquar;
    }

}

public class Aggregation {

    public static void main(String[] args) {

        double radius = 5.5;
        Circle c = new Circle();
        double result = c.area(radius);
        System.out.println(result);

    }

}
