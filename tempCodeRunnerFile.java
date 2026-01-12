public class ParaMeterized {
int speed;
String car;

    public ParaMeterized(int s ,String c) {

        speed = s;
        c=car;
        System.out.println(c+" Top Speed Is "+ s);

    }
    void display(){
        
        System.out.println(car+" Top Speed Is "+ speed);
    }
    public static void main(String[] args) {
        ParaMeterized display = new ParaMeterized(350, "Lamborghini");
        display.display();
    }
    
}
