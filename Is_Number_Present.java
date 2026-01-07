
import java.util.Scanner;

public class Is_Number_Present {
    public static void main(String[] args) {
        Boolean isFound = false;
        int [] arr = {8,65,8,4};
        Scanner SC = new Scanner(System.in);
        System.out.println("What Number You Want to find :");
        int userInput = SC.nextInt();
        for(int i = 0 ;i<arr.length;i++){
           if(arr[i]==userInput){
         isFound = true;
           }
        
    }
    if(isFound){
        System.out.println("Present");
    }
    else 
        System.out.println("Not Found");
    
    }}
