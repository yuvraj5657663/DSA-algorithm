public class LargestUsingMax {
    public static void main(String[] args) {
        int a = 20, b = 30, c = 40;
        
        int largest = Math.max(a, Math.max(b, c));
        System.out.println("Largest : " +largest);
    }
}
