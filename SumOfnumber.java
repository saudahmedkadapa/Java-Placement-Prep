import java.util.Scanner;

public class SumOfnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number =");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int digit =n%10;
            System.out.print(digit +"\t");
            sum=sum+digit;
            n=n/10;

        }
        System.out.println("sum="+sum);
    }
    
}
