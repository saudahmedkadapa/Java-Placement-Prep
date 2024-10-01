import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number=");
        int num=sc.nextInt();
        int result;

        try{
            result=num/0;
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch(InputMismatchException m)
        {
            m.printStackTrace();
        }
        
    }
    
}
