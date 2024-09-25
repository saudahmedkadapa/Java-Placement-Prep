import java.util.Scanner;

public class VowelsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word=");
        String word = sc.next();


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); 
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("Vowel= " + ch);
            }
            else{
                System.out.println("No Vowels Found!!");
                break;
            }
        }
        
    }

    
}
