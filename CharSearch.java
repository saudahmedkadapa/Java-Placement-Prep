import java.util.Scanner;

public class CharSearch {
    public static void main(String[] args) {
        char[]arr={'a','b','c','d','e'};
        Scanner sc=new Scanner(System.in);
        char search = 'c';
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(search + " found at index " + index);
        } else {
            System.out.println(search + " not found");
        }
        
    }
    
}
