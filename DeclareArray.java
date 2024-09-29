import java.util.Scanner;

public class DeclareArray {
    public static void main(String[] args) {
        int i;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of array=");
       int n=sc.nextInt();
       int []arr=new int[n];

       System.out.println("Enter the Elements =");
       for( i=0;i<n;i++)
       {
        arr[i]=sc.nextInt();
       }

       System.out.println("Array are =");
       for(i=0;i<n;i++)
       {
        System.out.println(arr[i]);
       }


    }
    
}
