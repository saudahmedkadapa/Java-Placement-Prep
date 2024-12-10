import java.util.Scanner;

public class IntPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number =");
        int num=sc.nextInt();
        int original=num;
        int rev=0;

        while(num!=0)
        {
            int digit=num%10;
            rev=rev*10+digit;
            num/=10;

        }
        if(original==rev)
        {
            System.out.println(original+ " number is palindrome");
        }
        else{
            System.out.println(original+"is not a palidrome ");
        }
    }
    
}


