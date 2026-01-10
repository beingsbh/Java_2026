
import java.util.Scanner;

public class Factorial_UsingFunc {

    static int Factorial(int a) {
        int f = 1;

        if (a < 0) {
            return -1;
        }

        for (int i = a; i >= 1; i--) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int n;
        System.out.print("Enter The Number ");
        n = SC.nextInt();
        int r = Factorial(n);
        if (r == -1) {
            System.out.println("Negetive NUmber Not Allowed ");

        } else {
            System.out.println("Factorial : " + r);
        }

    }
}
