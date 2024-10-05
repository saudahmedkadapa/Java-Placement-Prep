import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the $ number to convert ");
        float num=sc.nextFloat();
        float n=num*82;
        System.out.println("the $"+num+ "convert in rupees are "+n);

    }
    
}
