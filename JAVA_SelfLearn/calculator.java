import java.util.*;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    Double ans = 0.0;
    while(true){
    System.out.print("Enter operator (+, -, *, /, %):  ");
    char op = scanner.next().trim().charAt(0);
    System.out.print("Enter first number: ");
    Double num1 = scanner.nextDouble();
     System.out.print("Enter second number*: ");
     Double num2 = scanner.nextDouble();  
     
     if(op == '+' || op == '-'|| op == '*'|| op == '/' || op == '%'){
        if(op == '+'){
            ans = num1 + num2;

        }
        if (op == '-'){
          ans = num1 - num2;
        }
        if (op == '*'){
            ans = num1 * num2;
        }
        if (op == '/'){
            ans = num1 / num2;
        }
        if (op == '%'){
            ans = num1 % num2;
        }
        
     } else if (op == 'x' || op == 'X'){
            System.out.println("Exiting the calculator. Final result: " + ans);
            break;
        }

            else {
                System.out.println("Invalid operator!");
            }
            System.out.println("Result: " + ans);
        }
        }
    }





/* BETTER CODE (Using switch-case):

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter operator (+, -, *, /, %, x to exit): ");
            char op = scanner.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator.");
                break;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}

 */