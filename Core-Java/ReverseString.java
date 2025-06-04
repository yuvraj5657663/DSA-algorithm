public class ReverseString {
    public static void main(String[] args) {
        String str = "yuvraj";
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed : - " +reversed);
    }
}