
import java.util.Scanner;

public class Factorial_Usinglooop {
    public static void main(String[] args) {
Scanner SC = new Scanner(System.in);
int n ;

System.out.println("Enter the Number");
int fact = 0;
n = SC.nextInt();
for (int i = 1; i <=n; i++) {
fact = fact* i;
    
}
      System.out.println(fact);  
    }
    
}
