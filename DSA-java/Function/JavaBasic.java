import java.util.*;

public class JavaBasic {
    public static int Multiply(int a, int b) {
        int product = a * b;
        return product;

    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void primeRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }


    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = myNum/ 10;
        }
        System.out.println("decimal of" + myNum + " MyNum " + decNum);

    }
    
    public static void decTobin(int n) {
        int pow = 0;
        int binNum = 0;
        int myNum = n;
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;

        }
        System.out.println("binary form of " + myNum + "=" + binNum);
}
    


    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int prod = Multiply(a, b);
        System.out.println("a*b = " + prod);
        System.out.println(factorial(4));
        System.out.println(isPrime(5));
        primeRange(20);
        decTobin(11);
        binToDec(101);
        
    }

}