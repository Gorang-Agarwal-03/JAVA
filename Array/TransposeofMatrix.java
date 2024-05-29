package Array;

import java.util.Scanner;

public class TransposeofMatrix {

    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    /************************************************FIRST METHOD************************************************* */
    static int[][] Transpose(int [][]matrix,int r,int c){
        int ans[][] = new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];

            }   
        }
        return ans;
    }
    /**********************************************SECOND METHOD************************************************* */
    static void TransposeInPlace(int [][]matrix,int r,int c){

        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

    }
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Entre number of rows and colums of array:");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int [r][c];
        int totalElement = r*c;
        System.out.println("Entre "+totalElement+ " values");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix :");
        PrintMatrix(a);

        System.out.println("Transpose of Matrix is:");
        TransposeInPlace(a, r, c);
        PrintMatrix(a);
       // int [][] ans= Transpose(a, r, c);
        //PrintMatrix(ans);
    }
}
