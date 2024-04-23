import java.util.Scanner;

public class SumOfInput {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String numberString = scanner.nextLine();
        int sum = 0;
        for(int i=0;i<numberString.length();i++){
            sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}