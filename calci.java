import java.util.*;

public class calci {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(RED + "Welcome to My Calc App" + RESET);
        System.out.println(RED + "**********************" + RESET);
        int op, a = 0, b = 0;
        do {
            System.out.println("\n\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exit\n");
            System.out.print("Please Enter Your Option: ");
            op = sc.nextInt();
            if (op != 5) {
                System.out.print("Enter The First Number: ");
                a = sc.nextInt();
                System.out.print("Enter The Second Number: ");
                b = sc.nextInt();
            }
            switch (op) {
                case 1:
                    System.out.println("\nThe sum of " + a + " and " + b + " is " + (a + b));
                    break;
                case 2:
                    System.out.println("\nThe Subtraction of " + a + " and " + b + " is " + (a - b));
                    break;
                case 3:
                    System.out.println("\nThe Multiplication of " + a + " and " + b + " is " + (a * b));
                    break;
                case 4:
                    System.out.println("\nThe Division of " + a + " and " + b + " is " + (a / b));
                    break;
                case 5:
                    System.out.println(RED + "\n\nThank You for using ME........." + RESET);
                    break;
                default:
                    System.out.println("Choose Other Options");
                    break;
            } } while (op != 5);
    }
}
