public class PalindromeCheck {

    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);

    }

    public static boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        System.out.println("String - level : " + isPalindrome("level"));
        System.out.println("number - 12321 : " + isPalindrome(12321));
    }
}
