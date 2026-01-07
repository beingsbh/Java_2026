public class Avg_of_arr_elem {
    public static void main(String[] args) {
        int  [] arr ={54,32,12,98};
        int len = arr.length;
        int add =0;
      
        for(int i = 0; i<len; i++){
       
        add = add+ arr[i];
       
    
        }
       int  avg  = add/len;
       System.out.println(avg);
       
       
    }    
    
}
