
import java.util.Scanner;

public class Pacentages {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        double eng ;
        double beng;
        double comp;
        double math;
        double chem;
        double total;
        double percentage;
System.out.println("Enter The Marks Of English out Of 100");
eng=SC.nextDouble();
System.out.println("Enter The Marks Of Bengaliout Of 100");
beng=SC.nextDouble();
System.out.println("Enter The Marks Of Computer out Of 100");
comp=SC.nextDouble();
System.out.println("Enter The Marks Of Math out Of 100");
math=SC.nextDouble();
System.out.println("Enter The Marks Of Chemistry Of 100");
 chem=SC.nextDouble();  
 total=eng+beng+comp+math+chem; 
 System.out.println("Obtain Marks is " + total);
 percentage = (total/5);
 System.out.println("Percentages = "+ percentage+"%");

    }
    
}
