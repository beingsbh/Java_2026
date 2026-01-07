public class matrix_Addition {
    public static void main(String[] args) {
        
        int [][] mat1 ={{12,23,34},
                        {21,32,54}};
        int [][] mat2 ={{10,20,30},
                        {16,15,14}};
    for (int i = 0 ; i<mat1.length;i++){
        for(int j = 0; j<mat1[i].length;j++){
            int add = (mat1[i][j]+mat2[i][j]);
            System.out.print(add+ " ");
        }

System.out.println();
        
    }
    
    }
    
}
