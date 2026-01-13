public class tempCodeRunnerFile {
int speed;
String car;

    public tempCodeRunnerFile(int s ,String c) {

        speed = s;
        c=car;
        System.out.println(c+" Top Speed Is "+ s);

    }
    void display(){
        
        System.out.println(car+" Top Speed Is "+ speed);
    }
    public static void main(String[] args) {
        tempCodeRunnerFile display = new tempCodeRunnerFile(350, "Lamborghini");
        display.display();
    }
    
}
