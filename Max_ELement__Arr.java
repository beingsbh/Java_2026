public class Max_ELement__Arr {
    public static void main(String[] args) {
        
        int [] arr = {2,3,6,7,5,3,};
int max = arr[0];
for(int i = 0; i<arr.length;i++){

if(arr[i]>max){
   max = arr[i];

}
} 
System.out.println("The Maximum Element Is "+ max);
}
    
}
