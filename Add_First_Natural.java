public class Add_First_Natural {
static int sumOf(int x){
    if(x==1){
        return 1;
    }
 
   return x+sumOf(x-1);

    
}



    public static void main(String[] args) {
        
int n = 3;
int c=sumOf(n);

System.out.println(c);


    }
    
}
