import java.util.Scanner;

public class MatrixAddition {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter dimensions of matrices (rows columns): ");
int rows = scanner.nextInt();
int cols = scanner.nextInt();
System.out.println("Enter first matrix:");
int[][] matrix1 = readMatrix(scanner, rows, cols);
System.out.println("Enter second matrix:");
int[][] matrix2 = readMatrix(scanner, rows, cols);
int[][] result = addMatrices(matrix1, matrix2);
System.out.println("Matrix addition result:");
printMatrix(result);
}
public static int[][] readMatrix(Scanner scanner, int rows, int cols) {
int[][] matrix = new int[rows][cols];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++) {
matrix[i][j] = scanner.nextInt();
}
}
return matrix;
}
public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
int[][] result = new int[matrix1.length][matrix1[0].length];
for (int i = 0; i < matrix1.length; i++) {
for (int j = 0; j < matrix1[0].length; j++) {
result[i][j] = matrix1[i][j] + matrix2[i][j];
}
}
return result;
}
public static void printMatrix(int[][] matrix) {
for (int i = 0; i < matrix.length; i++) {
for (int j = 0; j < matrix[0].length; j++) {
System.out.print(matrix[i][j] + " ");
}
System.out.println();
}
}
}
