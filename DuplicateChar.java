import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the size=");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the Elemets array=");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        System.out.println();
        System.out.println("Array=");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+ ",");
        }

        System.out.println();
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println("Duplicate String="+arr[i]);
                    break;
                }
            }
        }
        

    }
    
}


