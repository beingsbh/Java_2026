
public class PrimeorNot {

    public static void main(String[] args) {
        int n = 31;
        if (n == 1 || n == 0) {
            System.out.println("n is not Prime");
        } else if (n % 2 != 0) {
            System.out.println("n is Prime");
        } else {
            System.out.println("Number Is not Prime");
        }
    }

}
