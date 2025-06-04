public class LargestOfThree {
    public static void main(String[] args) {
        int a = 20, b = 45, c = 30;

        if (a >= b && a >= c) {
            System.out.println("largest : " + a);

        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("largest: " + c);
        }
    }

}
