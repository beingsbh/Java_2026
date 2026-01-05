
import java.util.Scanner;

public class AdultorNot {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a ;
        System.out.println("Enter The Age Of The Candidate");
        a = SC.nextInt();
        if(a>=18){
            System.out.println("The Candidate is Adult");
        }
        else if (a<=0){
            System.out.println("Invalid input");
        }
        else
            System.out.println("The Candidate is not adult");
    }
    
}
