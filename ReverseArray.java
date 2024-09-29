import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size=");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Elements=");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Array=");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] +",");
        }

        System.out.println();

        
        int first=0;
        int last =arr.length-1;
        while(first<last)
        {
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            first++;
            last--;
        }
        System.out.println("Reverse array=");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] +",");
        }

    }

    
}