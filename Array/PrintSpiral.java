package Array;

import java.util.Scanner;

public class PrintSpiral {
    static void PrintMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
    static void printSpiral(int matrix[][],int r , int c){
        int topRow = 0;int bottomRow = r-1; int rightColumn=c-1;int leftColumn = 0;
        int totalElement = 0;

        while(totalElement<r*c){
            // Top Row -> left to right column
            for(int j=leftColumn;j<=rightColumn && totalElement<r*c;j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;

            // Right column -> top to bottom Row
            for(int j=topRow;j<=bottomRow && totalElement<r*c;j++){
                System.out.print(matrix[j][rightColumn]+" ");
                totalElement++;
            }
            rightColumn--;

            //BottomRow -> right to left columns 
            for(int j=rightColumn;j>=leftColumn && totalElement<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;
            

            // left column -> bottom to top Row
            for(int j=bottomRow;j>=topRow && totalElement<r*c;j--){
                System.out.print(matrix[j][leftColumn]+ " ");
                totalElement++;
            }
            leftColumn++;

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

        System.out.println("Spiral of Matrix is:");
            printSpiral(a, r, c);
            PrintMatrix(a);
    }
}
