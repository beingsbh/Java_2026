public class min_elem_arr {
public static void main(String[] args) {
    int [] arr ={5,8,9,8,5,7,};
    int  min = arr[0];

    for(int  i = 1 ; i<arr.length;  i++){
if(arr[i]<min){
    min = arr[i];
}



    }
System.out.println(min);

}




    
}
