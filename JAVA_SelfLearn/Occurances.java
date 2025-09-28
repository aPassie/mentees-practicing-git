import java.util.*;
import java.util.Scanner;

public class Occurances {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print("Enter a digit to count occurrences: ");
        int whichDigit = scanner.nextInt();

        int total = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == whichDigit) {
                total++;
            }
            num = num / 10;
        }
        System.out.println("Total Occurrences: " + total);
    }

}
