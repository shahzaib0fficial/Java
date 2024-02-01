import java.util.Scanner;

public class c22DoWhileLoop {
    public static void main(String args[]){
        String input = "q";
        Scanner scanner = new Scanner(System.in);
        do{ // run until once even codition is false
            System.out.println("Hello user");
            System.out.println("Enter q to quit or any other value to run again");
            input = scanner.next().toLowerCase();
        }while(!input.equals("q")); // runs until user wants(until won't enter q)
        scanner.close();
    }
}