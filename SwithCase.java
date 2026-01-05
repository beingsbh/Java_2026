
import java.util.Scanner;

public class SwithCase {public static void main(String[] args) {
    
    Scanner SC = new Scanner(System.in);
    System.out.println("Enter Age");
int age = SC.nextInt();
switch (age) {
    case 18:
        System.out.println("You are Becoming an Adult");
        break;
    default:
        throw new AssertionError();
}


}
    
}
