import java.util.Scanner;

public class SumOFArray{
    public static void main(String args[])
    {
        int i;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements=");
        for( i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array=");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i] +",");
        }
        System.out.println();
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum =sum+arr[i];
        }
        System.out.println("Sum="+sum);
        
    }

}