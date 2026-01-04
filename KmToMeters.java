
import java.util.Scanner;

public class KmToMeters {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println(" Enter Kilometer ");
        double km = SC.nextDouble();
        double m = km*1000;
        System.out.println(km+" Kelometres = "+m+" Meters");
        
    }
    
}
