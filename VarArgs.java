public class VarArgs {
    static int Sum (int ...arr){
        int r = 0;
        for (int a : arr){
            r += a;

        }
        return r;
    }
    public static void main(String[] args) {
        
    

      int b=  Sum(5+4);
        System.out.println(b);

    }
}
