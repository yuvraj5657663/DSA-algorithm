import java.util.Scanner;

public class VowelConsonantInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string: ");

        String str = sc.nextLine();

        int vowels = 0, consonant = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonant++;

                }

            }

            System.out.println("vowels: " + vowels);
            System.out.print(" consonants: " + consonant);
        }
    }
}
