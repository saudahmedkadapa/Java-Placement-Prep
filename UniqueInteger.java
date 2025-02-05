import java.util.HashSet;

public class UniqueInteger {

    public static void FindUNique(int arr[])
    {
        HashSet<Integer> unique=new HashSet<>();
        HashSet<Integer>duplicate=new HashSet<>();

        for(int num :arr)
        {
            if(!unique.add(num))
            {
                duplicate.add(num);
            }
        }

        System.out.println("unique element="+unique);
        System.out.println("duplicate elemet="+duplicate);

    }
    public static void main(String[] args) {
        int arr[]={5,3,1,8,3,7,5,6,9,8};
        FindUNique(arr);
    }
    
}
