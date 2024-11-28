import java.util.Scanner;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int flag=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number =");
        int n=sc.nextInt();
       
        
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    flag++;
                }
            }
            if(flag==2)
            {
                
                System.out.println("is Prime NUmber ");
            }
            else{
                System.out.println("not Prime number");
            }
        }
    }
    

