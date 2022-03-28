package SET1;
/*
Write a java program to find sum of each row and each column of a given matrix.
 */
import com.sun.security.jgss.GSSUtil;

import java.util.*;
public class Q9_Sum_in_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of rows");
        int row = sc.nextInt();
        System.out.println("Enter size of columns");
        int column = sc.nextInt();
        int matrix[][] = new int[row][column];
        System.out.println("Enter elements in the matrix");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix formed is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sumRow;
        for(int i=0; i<row; i++){
            sumRow = 0;
            for(int j=0; j<column; j++){
                sumRow += matrix[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);
        }
        int sumCol;
        for(int i=0; i<column; i++){
            sumCol = 0;
            for(int j=0; j<row; j++){
                sumCol += matrix[j][i];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);
        }
    }
}
