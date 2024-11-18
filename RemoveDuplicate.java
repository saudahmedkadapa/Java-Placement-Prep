public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 4, 3, 78, 9};
        boolean isDuplicate = false;

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    isDuplicate=true;
                    break;
                }
            }
            if(isDuplicate)
            {
                System.out.println(arr[i]);
                continue;
            }
        
           }

           System.out.println("Unique eleemt=");
           for(int i=0;i<arr.length;i++)
           {
            for(int j=0;j<i;j++)
            {
                if(arr[i]!=arr[j])
                {
                    isDuplicate=true;
                    break;
                }
            }
            if(isDuplicate)
            {
                System.out.println(arr[i]);
                continue;
            }
           }
        }
    }

