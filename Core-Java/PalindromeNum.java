public class PalindromeNum {
    public static void main(String[] args) {
        int num = 121, original = num, reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (original == reversed) {
            System.err.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
