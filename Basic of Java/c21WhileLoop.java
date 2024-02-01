import java.util.Scanner;

public class c21WhileLoop {
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(!input.equals("q")){ // runs until user wants(until won't enter q)
            System.out.println("Hello user");
            System.out.println("Enter q to quit or any other value to run again");
            input = scanner.next().toLowerCase();
        }
        scanner.close();
    }
}
