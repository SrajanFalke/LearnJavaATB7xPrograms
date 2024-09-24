package Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[] l1 = {10, 100};
        int[] l2 = {10, 12, 5, 100};

        // Create a matrix using the arrays
        int[][] matrix = { l1, l2 };

        // Display the matrix
        System.out.println("Matrix:");
        displayMatrix(matrix);
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
