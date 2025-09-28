import java.util.*;
import java.Scanner.util;

public class reversee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num / 10;

        }
        System.out.println("Reversed number: " + ans);
    }
}