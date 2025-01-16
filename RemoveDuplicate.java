public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 4, 3, 78, 9};
        boolean isDuplicate;

        System.out.println("Duplicate elements:");
        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false; // Reset isDuplicate for each element

            // Check if the current element has already been seen
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print if duplicate
            if (isDuplicate) {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println(); // Line break for better output formatting
        System.out.println("Unique elements:");
        for (int i = 0; i < arr.length; i++) {
            isDuplicate = false; // Reset isDuplicate for each element

            // Check if the current element has been seen before
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Print if not a duplicate
            if (!isDuplicate) {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
