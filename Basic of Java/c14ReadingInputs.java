import java.util.Scanner;

public class c14ReadingInputs {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer value : ");
        int data = scanner.nextInt();
        System.out.println("You Entered : "+data+" Integer");
        System.out.print("Enter text value : ");
        String text = scanner.next();
        System.out.println("You Entered : "+text+" Text");
        scanner.close();
    }
}