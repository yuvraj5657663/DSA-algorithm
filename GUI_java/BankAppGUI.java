import javax.swing.*;
import java.awt.event.*;

interface BankOperations {
    void deposit(double amount);

    void withdraw(double amount) throws Exception;

    void showBalance();
}

abstract class Account {
    protected String holderName;
    protected int accountNumber;
    protected double balance;

    public Account(String name, int accNo, double balance) {
        this.holderName = name;
        this.accountNumber = accNo;
        this.balance = balance;
    }

    public abstract void accountDetails();
}

class SavingsAccount extends Account implements BankOperations, Runnable {
    private JTextArea output;

    public SavingsAccount(String name, int accNo, double balance, JTextArea output) {
        super(name, accNo, balance);
        this.output = output;
    }

    @Override
    public synchronized void deposit(double amount) {
        balance += amount;
        output.append(  "deposited" + amount);
    }

    @Override
    public synchronized void withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception(" Insufficient balance!");
        }
        balance -= amount;
        output.append( "withdrawn"  + amount);
    }

    @Override
    public synchronized void showBalance() {
        output.append("Current Balance:" + balance);
    }

    @Override
    public void accountDetails() {
        output.append("Account Holder: " + holderName + "Account No: " + accountNumber + "Balance:" + balance
                );
    }

    @Override
    public void run() {
        // Simulate auto-deposit or usage
        try {
            deposit(1000);
            Thread.sleep(2000);
            withdraw(500);
        } catch (Exception e) {
            output.append("Thread Error: " + e.getMessage());
        }
    }
}

// Main GUI Application
public class BankAppGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" Bank Account System");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("Holder Name:");
        nameLabel.setBounds(30, 20, 100, 30);
        frame.add(nameLabel);

        JTextField nameField = new JTextField("Yuvraj");
        nameField.setBounds(140, 20, 200, 30);
        frame.add(nameField);

        JLabel accLabel = new JLabel("Account No:");
        accLabel.setBounds(30, 60, 100, 30);
        frame.add(accLabel);

        JTextField accField = new JTextField("101");
        accField.setBounds(140, 60, 200, 30);
        frame.add(accField);

        JLabel balLabel = new JLabel("Initial Balance:");
        balLabel.setBounds(30, 100, 100, 30);
        frame.add(balLabel);

        JTextField balField = new JTextField("10000");
        balField.setBounds(140, 100, 200, 30);
        frame.add(balField);

        JLabel amountLabel = new JLabel("Amount:");
        amountLabel.setBounds(30, 140, 100, 30);
        frame.add(amountLabel);

        JTextField amountField = new JTextField();
        amountField.setBounds(140, 140, 200, 30);
        frame.add(amountField);

        JTextArea output = new JTextArea();
        output.setBounds(30, 250, 420, 180);
        output.setEditable(false);
        frame.add(output);

        JButton createBtn = new JButton("Create Account");
        createBtn.setBounds(30, 190, 150, 30);
        frame.add(createBtn);

        JButton depositBtn = new JButton("Deposit");
        depositBtn.setBounds(190, 190, 100, 30);
        frame.add(depositBtn);

        JButton withdrawBtn = new JButton("Withdraw");
        withdrawBtn.setBounds(300, 190, 100, 30);
        frame.add(withdrawBtn);

        JButton balanceBtn = new JButton("Show Balance");
        balanceBtn.setBounds(140, 220, 150, 25);
        frame.add(balanceBtn);

        // Thread-safe reference
        final SavingsAccount[] account = new SavingsAccount[1];

        createBtn.addActionListener(e -> {
            String name = nameField.getText();
            int accNo = Integer.parseInt(accField.getText());
            double balance = Double.parseDouble(balField.getText());
            account[0] = new SavingsAccount(name, accNo, balance, output);
            output.setText(""); // Clear
            account[0].accountDetails();

            // Start background thread
            new Thread(account[0]).start();
        });

        depositBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account[0].deposit(amount);
            } catch (Exception ex) {
                output.append("Deposit Error\n");
            }
        });

        withdrawBtn.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                account[0].withdraw(amount);
            } catch (Exception ex) {
                output.append("Withdrawal Error: " + ex.getMessage() + "\n");
            }
        });

        balanceBtn.addActionListener(e -> {
            account[0].showBalance();
        });

        frame.setVisible(true);
    }
}
