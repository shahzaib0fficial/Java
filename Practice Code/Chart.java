import java.util.Scanner;

public class Chart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int n[] = new int[5];
        while (i<5) {
            System.out.print("Enter a Number: ");
            n[i] = scanner.nextInt();
            i++;
        }
        scanner.close();
        i = 0;
        while (i<5) {
            int j = 0;
            while (j<n[i]) {
                System.out.print("*");
                j++;
            }   
            i++;
            System.out.println();
        }
    }
}
