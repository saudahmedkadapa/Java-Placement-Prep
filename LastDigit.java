import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int n=sc.nextInt();
        
            int digit =n%10;
            System.out.println("last="+digit);

    }
    
}
