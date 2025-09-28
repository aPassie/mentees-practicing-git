import java.util.Scanner;

public class LeftSidedInverseNumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
          
            for (int k = 1; k <= n - i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        scanner.close();
    }
}