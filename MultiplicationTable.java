
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter Multiplication number : ");
        int n = SC.nextInt();
        for(int i = 1 ; i<=10 ;i++){
            int mul = n*i;
            System.out.println(n+" x " +i+" = "+mul);
        }
    }
    
}
