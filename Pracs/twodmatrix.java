package Pracs;

import java.util.Scanner;

public class twodmatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns : ");
        int mn = sc.nextInt();
        matrix objofmat = new matrix();

        int[][] matrix = new int[mn][mn]; 

        objofmat.input(sc, matrix, mn);
        objofmat.display(matrix, mn);
        objofmat.transpose(matrix, mn);

    }
}

class matrix{
    void input(Scanner sc, int[][]mat, int mn){
        System.out.println("Matrix Data : ");
        for(int i = 0; i<mn; i++){
            for(int j = 0; j<mn; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }

    void display(int[][] mat, int mn){
        System.out.println("Matrix is : ");
        for(int i = 0; i<mn; i++){
            for(int j = 0; j<mn; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }

    }

    void transpose(int[][] mat, int mn){
        System.out.println("Transpose of matrix is : ");
        for(int i = 0; i<mn; i++){
            for(int j = 0; j<mn; j++){
                System.out.print(mat[j][i]+"\t");
            }
            System.out.println();
        }
    }
}

