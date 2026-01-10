
public class Multiplication {


static int  mul (int a , int b){
    return a*b;

}

    public static void main(String[] args) {

int n = 9;
int muL;
for(int i = 1; i<=10;i++){

 muL = mul(n, i);
 System.out.format("%d x %d = %d \n",n,i,muL);


}



    }

}
