package ExceptionHandling;

import java.util.Scanner;

class ShortUsernameException extends Exception {
    public ShortUsernameException(String message) {
        super(message);
    }
}


public class SignUp {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = sc.nextLine();

        try {
            validateUsername(username);
            System.out.println("Signup successful with username: " + username);
        } catch (ShortUsernameException e) {
            System.out.println("wrong username faild" + e.getMessage());
        }

        sc.close();
    }


    public static void validateUsername(String username) throws ShortUsernameException {
        if (username.length() < 5) {
            throw new ShortUsernameException("Username must be at least 5 characters long.");
        }
    }
}