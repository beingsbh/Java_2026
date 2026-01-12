public class JavaClassMethod {
     void fullThrottal()
    {
        System.out.println("THe Car Running Its Maximum Speed ");
    }
     void carSpeed(int speed){
        System.out.println("The Car Speed Is :"+  speed);
    }
    public static void main(String[] args) {
        JavaClassMethod obj = new JavaClassMethod();
        obj.fullThrottal();
        obj.carSpeed(200);

    }
    
}
