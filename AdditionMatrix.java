import java.util.Scanner;

public class AdditionMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows=");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns=");
        int col=sc.nextInt();

        int matrix1[][]=new int[rows][col];
        int matrix2[][]=new int[rows][col];
        int addition[][]=new int[rows][col];

        System.out.println("Enter the value for matrix 1=");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix1[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix1[i][j] +" ");
            }
            System.out.println();
        }


        System.out.println("Enter the value for matrix 2=");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix1");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix2[i][j] +" ");
            }
            System.out.println();
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                addition[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        System.out.println("addition of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(addition[i][j] + " ");
            }
            System.out.println();
        }



    }
    
}
