public class ModifyAttribute {
      int x = 5;
      final int y = 32;
     public static void main(String[] args) {
        ModifyAttribute obj = new ModifyAttribute();
     obj.x =30;
    System.out.println(obj.x); 
//obj.y = 20 cannot assign a value to final variable y
        
     

    
}
}
