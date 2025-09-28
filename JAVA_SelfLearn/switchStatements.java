import java.util.Scanner;
public class switchStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String fruit = sc.next();
        switch (fruit){
case "apple":
System.out.print("A sweet red fruit");
break;
case "banana":
System.out.print("A long yellow fruit");
break;
case "orange":
System.out.print("Round orange fruit");
break;
default:
System.out.print("Unknown fruit");
        }

        /*better syntax 

        switch (fruit){
            case "apple" -> System.out.print("A sweet red fruit");
            case "banana" -> System.out.print(" long yellow fruit");
            case "orange" -> System.out.print("Round orange fruit");
            default -> System.out.print("Unknown fruit");

        }
            */
    }
}
