public class SwapwithXOR {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        // Swapping is already done above, nothing else is needed here.
        System.out.println("After swap : a = " + a + ", b = " + b);
    }
}   