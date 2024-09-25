import java.util.Scanner;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int i, m = 0, flag = 0;
        System.out.println("Ente the numbre=");
        int n = sc.nextInt();
        for( i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                flag++;
            }
        }
        if(flag==2)
        {
            System.out.println(n+ " Prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
    }
       

}
