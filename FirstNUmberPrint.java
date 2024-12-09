import java.util.Scanner;

public class FirstNUmberPrint {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number =");
        int num=sc.nextInt();
        
        // if(num<0)
        // {
        //     num=-num;
        // }

        int firstnumber=num;
         
        while (firstnumber >10)
        {
            firstnumber=firstnumber/10;
            
        }
        System.out.println(firstnumber);
    }
    
}
