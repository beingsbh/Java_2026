public class ParaMeterized {
int speed;
String car;

    public ParaMeterized(int s ,String c) {

        speed = s;
         car = c;
        
    }
    void display(){
        
        System.out.println(car+" Top Speed Is "+ speed);
    }
    public static void main(String[] args) {
      ParaMeterized obj = new ParaMeterized(200, "Lamborghini");
      obj.display();
    }
    
}
