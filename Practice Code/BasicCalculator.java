import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the Expression");
        Scanner scanner = new Scanner(System.in);
        int op1 = scanner.nextInt();
        String op = scanner.next();
        int op2 = scanner.nextInt();
        scanner.close();

        if(op.equals("+")){
            System.out.println(op1 + op + op2 + " = " + (op1+op2));
        }
        else if(op.equals("-")){
            System.out.println(op1 + op + op2 + " = " + (op1-op2));
        }
        else if(op.equals("*")){
            System.out.println(op1 + op + op2 + " = " + (op1*op2));
        }
        else if(op.equals("/")){
            System.out.println(op1 + op + op2 + " = " + (op1/(float)op2));
        }
        else{
            System.out.println("Invalid Something");
        }
    }
}
