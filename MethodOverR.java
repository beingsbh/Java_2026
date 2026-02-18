
class Vehicle {

    public void run() {
        System.out.println("Vehicle Is Runing");
    }
}

class Bike extends Vehicle {

    public void run() {
        System.out.println("Bike Run Safely");
    }

}

public class MethodOverR {

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }

}
