import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int num3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number =");
        int n=sc.nextInt();
        System.out.print(num1+","+num2);
        for(int i=0;i<n;i++)
        {
            num3=num1+num2;
            System.out.print(","+num3);
            num1=num2;
            num2=num3;
        }

        
    }
    
}
