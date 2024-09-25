import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius=");
         double r=sc.nextDouble();
        double pi=3.14;
        double area;
        try{
            area=pi*(r*r);
            System.out.println("Area of Cirlc="+area);

        }catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch(InputMismatchException m)
        {
            System.out.println(m.getMessage());
        }
       
        
    }
    
}
