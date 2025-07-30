package ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String massage) 
    {
        super(massage);
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        System.out.print("enter amount to withdraw ");
        double withdrawAmount = sc.nextDouble();

        try {
            withdraw(balance, withdrawAmount);
            System.out.println(" Withdrawal successful. Remaining Balance: " + (balance - withdrawAmount));
        } catch (InsufficientBalanceException e) {
            System.out.println("error please try again" + e.getMessage());
        }
        sc.close();
    }

    public static void withdraw(double balance, double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds available balance.");
        }
    }
}
