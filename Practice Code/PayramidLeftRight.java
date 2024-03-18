public class PayramidLeftRight {
    public static void main(String[] args) {
        int lines = 10;
        
        for (int i = 1; i <= lines; i++) {            
            // Printing stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            // Printing spaces
            for (int l = 0; l <= 2 * (lines - i); l++) {
                System.out.print(" ");
            }
            
            for (int m = 1; m <= i; m++) {
                System.out.print("*");
            }
            
            // Moving to the next line
            System.out.println();
        }
    }
}
