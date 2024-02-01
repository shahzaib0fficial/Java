import java.util.Arrays;
public class c8Arrays {
    public static void main(String[] args){
        // int numbers[] = new int[5];
        // numbers[0] = 2;
        // numbers[1] = 1;
        // numbers[2] = 0;
        // numbers[3] = 4;
        // numbers[4] = 3;

        int numbers[] = {2,1,0,4,3}; // Shorthand of declearing and initializing Array
        
        System.out.println("Address of Array : "+numbers); // Prints Array address
        System.out.println("Array Data in String foam : "+Arrays.toString(numbers)); //Print whole Array in String foam
    }
}