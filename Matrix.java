package com.sjsu;

import java.util.Scanner;

public class Matrix {
    public static void main(String [] args) {

        //prompt for size of rows and columns
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns:");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        //populate matrix with values
        System.out.print("Enter the values of matrix:");
        String matrixValues;
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                matrixValues = input.next();
                matrix[i][j] = Integer.parseInt(matrixValues);

            }

        }
        System.out.print("Sum of major diagonal is:" + sumMajorDiagonal(matrix));
        System.out.println();
        display(matrix);

        System.out.println();

        transposeMatrix(matrix);

        }

    public static int sumMajorDiagonal(int[][] squareMatrix){
        int sum = 0;
        for (int i = 0; i < squareMatrix.length; i++) {
            for (int j = 0; j < squareMatrix[i].length ; j++) {
               // if ((i + j) == (squareMatrix.length - 1)) for the secondary diagonal, (i + j) == ( n - 1)
                if (i == j) { //the indices of the major diagonal are equivalent
                    sum += squareMatrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void transposeMatrix(int[][] square){

        int [][] newMatrix = new int[square.length][square[0].length];
        for (int i = 0; i < square.length ; i++) {
            for (int j = 0; j < square[i].length; j++) {
                newMatrix[j][i] = square[i][j];
            }

        }
        sumMajorDiagonal(newMatrix);
        System.out.print("Sum of major diagonal after transposing:" + sumMajorDiagonal(newMatrix));
        System.out.println();
        display(newMatrix);
    }

    public static void display(int[][] matrix){
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println(" ");

        }
    }

}
