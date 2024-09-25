public class SwapNumber {
    public static void main(String[] args) {
        int a = 45;
        int b = 56;
        System.out.println("Before swapping a=" + a + "\tb=" + b);
        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("After swaping a="+a + "\tb="+b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swaping a=" + a + "\tb=" + b);

    }

}