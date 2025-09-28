import java.util.*;
import java.util.Scanner;
public class largestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    
      /*   int max = a;
        if (max < b) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Largest number is: " + max);    */
        // or can be done by
       int max = 0;
       max = Math.max(c, Math.max(a, b));
       System.out.println("Largest number is: " + max); 
    }
    
}
