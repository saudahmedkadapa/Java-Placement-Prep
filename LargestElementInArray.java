import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of array=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemets =");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array are=");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ,");
        }
        System.out.println();

        int max=arr[0];

        for(i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println("max elemet are="+max);
        
    }
    
}
