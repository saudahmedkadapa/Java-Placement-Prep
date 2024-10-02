import java.util.Scanner;

public class PatternA {
    public static void main(String[] args) {
        String m = "ABCDEF";
        System.out.println("**** Enter the number of lines:");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        for (int i = 0; i < p; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(m.charAt(j));
            }
            System.out.println();
        }
    }
}
