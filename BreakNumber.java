import java.util.Scanner;

public class BreakNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int d;
        System.out.println("Enter the number to break");
        int n=sc.nextInt();
        while (n>0) {
             d=n%10;
            System.out.println(d);
            sum+=d;
            n=n/10;
        }
        System.out.println("sum="+sum);
       
    }
    
}
