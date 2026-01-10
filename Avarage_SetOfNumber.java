public class Avarage_SetOfNumber {
    
   static int avarege(int...x){
        int y = 0;
        int z= x.length;
        for(int a : x){
            y+=a;
        }
        return y/z;

    }
    
    public static void main(String[] args) {
      
        float a = avarege(3,4,2,5,6);
        
System.out.println(a);

    }
    
}
