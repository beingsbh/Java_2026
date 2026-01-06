import java.util.Random;
import java.util.Scanner;

public class RockPaSe {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Random RD = new Random();
        
        int c = RD.nextInt((3)+1);
        System.out.println(" Press '1' = Rock \n Press '2' = Paper \n Press '3' = Seccior ");
       System.out.print(" Enter Your Turn : ");
       int u = SC.nextInt();
      
  if((u==1 && c==3) || (u==2 && c==1 ) || (u==3 && c==1) ){
    System.out.println("You Win");
    }
    else
        System.out.println("You Lose");
    
}
}
