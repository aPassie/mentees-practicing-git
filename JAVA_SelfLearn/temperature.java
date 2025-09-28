import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celtemp = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit is: " + (celtemp * 9 / 5 + 32));
    }
}
