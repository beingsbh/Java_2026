
class Animal {

    String color = "White";

    void responds() {
        System.out.println("Animal sound is .......");

    }
}

class Dog extends Animal {

    String color = "Black";

    //super.color;
    void responds() {
        System.out.println("The Do Is Barking");
        super.responds();

    }

}

public class SuperMehtod {

    public static void main(String[] args) {

        Dog d = new Dog();
        System.out.println(d.color);
        d.responds();

    }

}
