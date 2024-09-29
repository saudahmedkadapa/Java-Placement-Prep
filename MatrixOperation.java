import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size =");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int add[] = new int[n];
        int sub[] = new int[n];
        int multi[] = new int[n];
        int op;
        System.out.println("Enter elemnts array1=");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Array 1=");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + ",");
        }
        System.out.println();

        System.out.println("Enter elemnts array2=");

        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array 2=");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.println();

        do {
            System.out.println("1.Addition \n 2.Substraction \n 3.Multiplication \n 4.Exit");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    for (int i = 0; i < n; i++) {
                        add[i] = arr1[i] + arr2[i];
                    }
                    System.out.println();

                    System.out.println("Addition");

                    for (int i = 0; i < n; i++) {
                        System.out.print(add[i] + ",");
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        sub[i] = arr1[i] - arr2[i];
                    }
                    System.out.println();

                    System.out.println("Substraction");

                    for (int i = 0; i < n; i++) {
                        System.out.print(sub[i] + ",");
                    }
                    System.out.println();

                    break;

                case 3:
                    for (int i = 0; i < n; i++) {
                        multi[i] = arr1[i] * arr2[i];
                    }
                    System.out.println();

                    System.out.println("Multiplication=");

                    for (int i = 0; i < n; i++) {
                        System.out.print(multi[i] + ",");
                    }
                    System.out.println();

                    break;
                case 4:
                    System.out.println("Exit...");
                    break;

                default:
                    System.out.println("Invalid !!");
                    break;

            }
        } while (op != 4);

    }

}
