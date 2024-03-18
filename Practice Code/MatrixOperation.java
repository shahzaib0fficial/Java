import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperation {
    void DisplayMatrix(int[][] matrix,int rows,int columns){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    int[][] tempArrayReturner(int[][] matrix,int rows,int columns){
        int[][] tempMatrixArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tempMatrixArray[i][j] = matrix[i][j];
            }
        }
        return tempMatrixArray;
    }

    int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        return sum;
    }

    int largestElement(int[] arr){
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        MatrixOperation matrixOperation = new MatrixOperation();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Rows : ");
        int rows = scanner.nextInt();
        System.out.print("Enter Number of Columns : ");
        int columns = scanner.nextInt();

        if (rows > 0 && columns > 0) {
            int[][] matrix = new int[rows][columns];

            // Input values into the matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter " + (i + 1) + " Row " + (j + 1) + " Column Value : ");
                    matrix[i][j] = scanner.nextInt();
                }
            }
            scanner.close();

            // Display the matrix in tabular format.
            System.out.println("Display the matrix in tabular format");
            matrixOperation.DisplayMatrix(matrix,rows,columns);

            // Sort the matrix row-wise
            int[][] tempMatrixArray = matrixOperation.tempArrayReturner(matrix, rows, columns);
            
            for (int i = 0; i < rows; i++) {
                Arrays.sort(tempMatrixArray[i]);
            }

            System.out.println("Display the matrix in tabular format After Sorting Row wise");
            matrixOperation.DisplayMatrix(tempMatrixArray, rows, columns);

            // Sort the matrix column-wise
            tempMatrixArray = matrixOperation.tempArrayReturner(matrix, rows, columns);

            for (int i = 0; i < columns; i++) {
                int[] tempArray = new int[rows];

                for (int k = 0; k < rows; k++) {
                    tempArray[k] = tempMatrixArray[k][i];
                }
                Arrays.sort(tempArray);
                for (int l = 0; l < rows; l++) {
                    tempMatrixArray[l][i] = tempArray[l];
                }
            }

            System.out.println("Display the matrix in tabular format After Sorting Column wise");
            matrixOperation.DisplayMatrix(tempMatrixArray, rows, columns);
        
            // Display the sum of each row
            System.out.println("Display the sum of each row");
            int sum = 0; // for sum of all elements in the matrix
            for(int i=0;i<rows;i++){
                int rowSum = matrixOperation.sum(matrix[i]);
                sum = sum + rowSum; // for sum of all elements in the matrix
                System.out.println("Row " + (i+1) + " Sum : " + rowSum);
            }

            // Display the sum of each column
            System.out.println("Display the sum of each Column");
            for(int i=0;i<columns;i++){
                int[] tempArray = new int[rows];

                for (int k = 0; k < rows; k++) {
                    tempArray[k] = matrix[k][i];
                }

                System.out.println("Column " + (i+1) + " Sum : " + matrixOperation.sum(tempArray));
            }

            // Display the sum of all elements in the matrix
            System.out.println("Sum of all elements in the matrix : "+sum);

            // Find the largest element in each row
            System.out.println("Largest Element in each rows");
            int largest = matrix[0][0]; // for Find the largest element in the entire matrix
            for(int i=0;i<rows;i++){
                int largestRowValue = matrixOperation.largestElement(matrix[i]);
                if(largestRowValue > largest){
                    largest = largestRowValue;
                }
                System.out.println("Row " + (i+1) + " Largest Element : " + largestRowValue);
            }
            
            // Find the largest element in each column
            System.out.println("Largest Element in each columns");
            for(int i=0;i<columns;i++){
                int[] tempArray = new int[rows];

                for (int k = 0; k < rows; k++) {
                    tempArray[k] = matrix[k][i];
                }

                System.out.println("Column " + (i+1) + " Largest Element : " + matrixOperation.largestElement(tempArray));
            }

            // Find the largest element in the entire matrix
            System.out.println("Largest element in the entire matrix : "+largest);
        }
        else {
            System.out.println("Rows and Column must be greater than 0");
        }
    }
}