
class Engine {

    void makeEngine() {
        System.out.println("Engine Created");
    }

}

class Tayers extends Engine {

    void tayersCreating() {
        System.out.println("Tayers Created");
    }
}

class Car extends Tayers {

    void carCreating() {
        System.out.println("Cars Created");
    }
}

class Multilevelinherit {

    public static void main(String[] args) {
        Car c = new Car();
        c.makeEngine();
        c.tayersCreating();
        c.carCreating();
    }
}
