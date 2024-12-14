import java.util.Arrays;

public class ThirdHighestNumber2 {
    public static void main(String[] args) {
        int []arr1={5,4,3,8,1,10,6};
        Arrays.sort(arr1);
        System.out.println("sorted array are ="+Arrays.toString(arr1));

        if(arr1.length>=2)
        {
            System.out.println(arr1[arr1.length-2]);
        }
        else{
            System.out.println("not enough elemmet ");
        }
    }
    
}
