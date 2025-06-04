public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) {
            System.out.println("it is a palindrome");

            
        } else {
            System.out.println("it not a palindrome");
        }
    }
}
