import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number of rows=");
        int rows=sc.nextInt();
        System.out.println("Enter the number of Columns=");
        int col=sc.nextInt();

        int arr[][]=new int[rows][col];
        System.out.println("Enter the number =");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        } 

        System.out.println("Matrix=");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }


    }
    
}
