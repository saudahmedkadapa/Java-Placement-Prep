import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TryCatchWithFileHandling {
    public static void main(String[] args) {
        File ff=new File("Demo.txt");

        try{
            Scanner sc=new Scanner(ff);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        }
        catch(FileNotFoundException n)
        {
            n.printStackTrace();
        }
        catch(IOException i)
        {
            i.printStackTrace();
        }
        
    }
    
}
