import java.util.Scanner;

public class LastNumberPrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        int num=sc.nextInt();
        int digit=0;

        while(num!=0)
        {
             digit =num%10;
             break;
        }

        System.out.println(digit);
    }
    
}
