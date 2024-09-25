import java.util.ArrayList;

public class PractArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> obj=new ArrayList<>();
        obj.add(45);
        obj.add(56);
        obj.add(78);
        obj.add(89);
        obj.add(33);
        obj.add(5);
        System.out.println(obj);
        System.out.println(obj.size());
        obj.remove(2);
        System.out.println(obj);
    }
    
}
