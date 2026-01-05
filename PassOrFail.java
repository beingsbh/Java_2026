import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter The Number Of Math");
        int m = SC.nextInt();
        System.out.println("Enter The Number Of ENglish");
        int e = SC.nextInt();
        System.out.println("Enter The Number Of Computer");
        int c = SC.nextInt();
        int avg =(m+e+c)/3;
        if(avg>=40 && m>=30 && e>=30 &&c>=30){
            System.out.println("The Student Is Pass");
        }
        else{
            System.out.println("Better Luck Next Time");}
            System.out.println(avg);
    }
    
    
}
