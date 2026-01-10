public class Print_nTo1 {

    static int rev(int a){
        if(a==0){
            return 1;
        }
        return rev(a-1);

    }

    public static void main(String[] args) {

        int n = 5;
        int v = rev(n);
        System.out.println(v);
        
    }
    
}
