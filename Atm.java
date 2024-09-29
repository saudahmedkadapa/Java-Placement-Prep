import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 45000;
        double withdraw;
        double deposit;
        int op;

  
        System.out.println("Enter the pin=");
        double password = sc.nextDouble();

        
        if (password == 1234) {
           
            do {
                System.out.println("1. Check balance \n2. Withdraw \n3. Deposit \n4. Exit");
                System.out.println("Enter the number of operation:");
                op = sc.nextInt();

                switch (op) {
                    case 1:
                       
                        System.out.println("Balance = " + balance);
                        System.out.println("----------------------");
                        break;
                    case 2:
                        
                        System.out.println("Enter the amount to withdraw:");
                        withdraw = sc.nextDouble();
                        if (withdraw <= balance && withdraw > 0) {
                            balance -= withdraw; 
                            System.out.println("Withdrawn amount = " + withdraw);
                            System.out.println("Remaining balance = " + balance);
                        } else if (withdraw <= 0) {
                            System.out.println("Invalid withdrawal amount!");
                        } else {
                            System.out.println("Insufficient balance!");
                        }
                        System.out.println("----------------------");
                        break;
                    case 3:
                        
                        System.out.println("Enter the deposit amount:");
                        deposit = sc.nextDouble();
                        if (deposit > 0) {
                            balance += deposit; 
                            System.out.println("Deposit successful!");
                            System.out.println("Deposited amount = " + deposit);
                            System.out.println("Updated balance = " + balance);
                        } else {
                            System.out.println("Invalid deposit amount!");
                        }
                        System.out.println("----------------------");
                        break;
                    case 4:
                        
                        System.out.println("Exiting...");
                        System.out.println("----------------------");
                        break;
                    default:
                        
                        System.out.println("Invalid operation!");
                        System.out.println("----------------------");
                        break;
                }

            } while (op != 4); 

        } else {
            System.out.println("Pin is not correct.");
        }
    }
}
