public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234455;
        int sum = 0;

        while (sum > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("sum of digits:  " + sum);
    }
}
