import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string =");
        String s=sc.next();
        System.out.println("Reverse String=");
        String r="";
        for(int i =s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        System.out.println("reverse="+r);


    }
    
}
