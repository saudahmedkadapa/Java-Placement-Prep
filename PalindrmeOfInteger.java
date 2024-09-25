import java.util.Scanner;

public class PalindrmeOfInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number=");
        int n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            int digit=n%10;
            sum=(sum*10)+digit;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindorme");
        }
        else{
            System.out.println("Not a palindorme");
        }
    }
    
}
