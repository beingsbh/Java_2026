
class Rectangle {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
       this. length = length;
       this. breadth = breadth;

    }

    double areaOfRectangle() {
        return  length * breadth;
    }

    double Perimeter() {
        return 2 * (length + breadth);
    }

}

public class RectangleCalculation {

    public static void main(String[] args) {

        Rectangle obj = new Rectangle(20, 30);

        double x = obj.areaOfRectangle();
        double y = obj.Perimeter();

        System.out.println(x + " and " + y);

    }

}
