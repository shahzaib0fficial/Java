import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        System.out.print("Enter between 1 to 10 : ");
        
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        scanner.close();

        int found = 0;
        int first = 0;
        int last = 9;
        int mid;

        while (first <= last) {
            mid = (first + last)/2;
            if(val == arr[mid]){
                found++;
                break;
            }
            else if(val < arr[mid]){
                last = mid;
            }
            else{
                first = mid + 1;
            }
        }
        if(found > 0){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }
}