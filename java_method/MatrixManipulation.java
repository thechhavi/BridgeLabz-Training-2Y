package java_method;
import java.util.Scanner;

public class MatrixManipulation {

    // Method to generate a random matrix
    public static double[][] generateMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10); // values 0–9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%8.2f", val);
            }
            System.out.println();
        }
    }

    // Method to find the transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] trans = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
             - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
             + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) {
            System.out.println("Matrix is singular, no inverse exists.");
            return null;
        }
        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) {
            System.out.println("Matrix is singular, no inverse exists.");
            return null;
        }

        double[][] inv = new double[3][3];
        inv[0][0] =  (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / det;
        inv[0][2] =  (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / det;
        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / det;
        inv[1][1] =  (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / det;
        inv[2][0] =  (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / det;
        inv[2][2] =  (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for size
        System.out.print("Enter size of square matrix (2 or 3): ");
        int n = sc.nextInt();

        if (n != 2 && n != 3) {
            System.out.println("Only 2x2 or 3x3 matrices supported!");
            return;
        }

        double[][] matrix = generateMatrix(n, n);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose:");
        displayMatrix(transpose(matrix));

        if (n == 2) {
            double det = determinant2x2(matrix);
            System.out.println("\nDeterminant (2x2): " + det);

            double[][] inv = inverse2x2(matrix);
            if (inv != null) {
                System.out.println("\nInverse (2x2):");
                displayMatrix(inv);
            }
        } else {
            double det = determinant3x3(matrix);
            System.out.println("\nDeterminant (3x3): " + det);

            double[][] inv = inverse3x3(matrix);
            if (inv != null) {
                System.out.println("\nInverse (3x3):");
                displayMatrix(inv);
            }
        }

        sc.close();
    }
}
