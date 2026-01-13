import java.util.Random;
import java.util.Scanner;

public class RockPaSe{
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Random RD = new Random();
        int c = RD.nextInt(3)+1;
        int n ;
        System.out.println("\nLets Play ! \n Press '1' Forr Rock \n Press '2' For Paper  \n Press '3' For Seccior \n");
    System.out.println("Enter Your Turn : ");
    n=SC.nextInt();
    if( n >3 || n==0){
        System.out.println("Invalid Input");
    }
   else if ((c==1 && n==2) || (c==2 && n==3) || (c==3 && n==1)) {
        System.out.println("You Loos !");
        
    }
    else if(c==n){
        System.out.println("Draw ! Retry");
    }
 
    else{
        System.out.println("You Win !");
    }
        



    }

}