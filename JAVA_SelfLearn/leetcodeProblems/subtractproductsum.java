//1281. Subtract the Product and Sum of Digits of an Integer
import java.util.Scanner;
public class subtractproductsum {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int a = 0;
       int sum =0;
       int pro= 1;
      
        while(inp > a){
           int y = inp % 10;
            sum = sum + y;
           inp = inp/10;
              pro = pro * y;
        }

       
   System.out.print(pro - sum);
    }
}