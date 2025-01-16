import java.util.Scanner;

public class SumDigitIsPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the nnumber=");
        int n=sc.nextInt();
        int lastnum=n%10;
        System.out.println("lastnum="+lastnum);
        int firstnum = n;
        while (firstnum >= 10) {
            firstnum /= 10;
        }
        System.out.println("First number = " + firstnum);
        sum=firstnum+lastnum;
        System.out.println("Sum="+sum);
        int rev=0;
        int og=sum;
        while(sum>0)
        {
            int digit =sum%10;
            rev=rev*10+digit;
            sum=sum/10;
        }

        System.out.println("reverse="+rev);

        if(sum>=10)
        {
        if(og==rev)
        {
            System.out.println("the sum is palindrme");
        }
        else{
            System.out.println("is not a palindorme");
        }
    }
    else{
        System.out.println("sum of number is single  digit which cant be palindorme");
    }
    }
}
