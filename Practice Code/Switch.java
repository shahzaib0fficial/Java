import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner si = new Scanner(System.in);
		int choice;
		String name;
		String age;
		System.out.println("What you want to do?");
		System.out.println("1. Print your name");
		System.out.println("2. Print your age");
		System.out.println("3. Exit");
		choice = Integer.parseInt(si.nextLine());
		switch(choice) {
			case 1: 
			System.out.print("Enter you name: ");
			name = si.nextLine();
			System.out.println("Welcome "+name);
			break;
			case 2:
			System.out.print("Enter you age: ");
			age = si.nextLine();
			System.out.println("You are "+age);
			break;
			case 3:
			System.exit(0);
		}
        si.close();
	}
}
