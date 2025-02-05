import java.util.Arrays;
import java.util.Scanner;

public class ThirdHighestNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array=");
        int n=sc.nextInt();
        System.out.println("Enter the array=");
        int[] arr=new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }

        System.out.println("Sorted array are=");
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
        System.out.println("third highest elemet=");
       
            if(arr.length>=3)
            {
                System.out.println(arr[arr.length-3]);
            }
           
        
        
    }
    
}
