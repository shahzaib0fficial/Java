import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        double bill = 0.0;
        String again = "y";
        Scanner scanner = new Scanner(System.in);

        while (again.equals("y")) {
            System.out.println("Please Select one");
            System.out.println("1. Product 1\n2. Product 2\n3. Product 3\n4. Product 4\n5. Product 5");
            int productChoice = scanner.nextInt();

            if (productChoice > 0 && productChoice < 6) {

                System.out.print("Quantity : ");
                int quantity = scanner.nextInt();

                if (quantity > 0) {
                    switch (productChoice) {
                        case 1:
                            bill = bill + (quantity * 2.98);
                            break;
                        case 2:
                            bill = bill + (quantity * 4.50);
                            break;
                        case 3:
                            bill = bill + (quantity * 9.98);
                            break;
                        case 4:
                            bill = bill + (quantity * 4.49);
                            break;
                        case 5:
                            bill = bill + (quantity * 6.87);
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                    }
                } else {
                    System.out.println("Quantity must be greater than 0");
                }
            }
            else{
                System.out.println("Invalid Choice");
            }

            System.out.print("Would you like to continue(y/n) : ");
            again = scanner.next();
        }
        System.out.println("Total : " + bill);
        scanner.close();
    }
}