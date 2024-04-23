import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int number;
		String userInput;
		System.out.print("Enter a number : ");
		userInput = si.nextLine();
        si.close();
		number = Integer.parseInt(userInput);
		if(number == 0) {
			System.out.println("Zero");
		}else if(number > 0) {
			if(number % 2 == 0) {
				System.out.println("positive and even");
			}else {
				System.out.println("positive and odd");
			}
		}else {
			if(number % 2 == 0) {
				System.out.println("negative and even");
			}else {
				System.out.println("negative and odd");
			}
		}
	}
}