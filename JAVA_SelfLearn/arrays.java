import java.util.*;
public class Arrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //syntax to declare and initialize an array
        //datatype[] variableName = new datatype[size];

       // int [] rollNos= new int[5];
       //or 
       // int[] rollNos={11,22,33,44,55};

/*int [] arr = new int[5];
arr[0]=10;
arr[1]=20;  
arr[2]=30;
arr[3]=40;
arr[4]=50;
// inputing above thing easily with loops
for (int i = 0; i< arr.length; i++){
    arr[i]= sc.nextInt();   */

   String[] arr = new String[5];
   for(int i =0; i < arr.length; i++){
    arr[i] = sc.next();

   }
   System.out.print(Arrays.toString(arr));

}  

}