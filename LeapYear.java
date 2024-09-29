import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter the year");
        Scanner y = new Scanner(System.in);
        year = y.nextInt();
        if (year % 4 == 0 ) {
            System.out.println(+year + " is a Leap year ");
        } else {
            System.out.println(+year + " is not Leap Year");
        }

        
        // && year % 100 != 0) || (year % 400 == 0)
       
    }
    
}
