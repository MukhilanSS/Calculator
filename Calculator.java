import java.util.*;

public class Calculator {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int choice; 
        do {
            System.out.println(RED + "Welcome to My Calc App" + RESET);
            System.out.println("**********************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println(RED + "Enter your choice:" + RESET);
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                System.out.println(RED + "Enter Value 1:" + RESET);
                int num1 = sc.nextInt();
                System.out.println(RED + "Enter Value 2:" + RESET);
                int num2 = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println(Sum(num1, num2));
                        break;
                    case 2:
                        System.out.println(Difference(num1, num2));
                        break;
                    case 3:
                        System.out.println(Product(num1, num2));
                        break;
                    case 4:
                        System.out.println(Division(num1, num2));
                        break;
                }
            } else if (choice == 5) {
                break;
            } else {
                System.out.println(RED + "Choose a valid number (1-5)" + RESET);
            }
        } while (choice != 5);
    }

    public static String Sum(int num1, int num2) {
        int ans = num1 + num2;
        return "The sum of " + num1 + " and " + num2 + " is " + ans;
    }

    public static String Difference(int num1, int num2) {
        int ans = num1 - num2;
        return "The difference of " + num1 + " and " + num2 + " is " + ans;
    }

    public static String Product(int num1, int num2) {
        int ans = num1 * num2;
        return "The product of " + num1 + " and " + num2 + " is " + ans;
    }

    public static String Division(int num1, int num2) {
        if (num2 == 0) {
            return "Cannot divide by zero.";
        }
        int ans = num1 / num2;
        return "The division of " + num1 + " by " + num2 + " is " + ans;
    }
}
