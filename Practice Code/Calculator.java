import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double val1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double val2 = scanner.nextDouble();

        System.out.println("1. Addition (+).\n2. Subtraction (-).\n3. Multiplication (*).\n4. Division (/).");
        System.out.println("Enter operation number: ");
        int choice = scanner.nextInt();
        scanner.close();

        double ans = 0.0;
        switch (choice) {
            case 1:
                ans = val1 + val2;
                break;
            case 2:
                ans = val1 - val2;
                break;
            case 3:
                ans = val1 * val2;
                break;
            case 4:
                ans = val1 / val2;
                break;
        }
        System.out.println("The result is " + ans);
    }
}
