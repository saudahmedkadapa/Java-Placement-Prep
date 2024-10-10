import java.util.ArrayList;

public class ArrayListQuest2 {
     public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2 =new ArrayList<>(5) ;
        l1.add(6);
        l1.add(5);

        l1.add(4);
        l1.add(2);
        l2.add(10);
        l2.add(20);
        l2.add(40);
        l2.add(30);
        
        l1.add(0,5);
        l1.add(0,1);

        l1.set(1, 121);

        l1.addAll(l2);
        //l1.clear();
        

        l1.add(0,5);
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(2));


        for(int i=0;i<l1.size();i++)
        {

            System.out.print(l1.get(i));
            System.out.print(", ");

        }
    }
    
}
