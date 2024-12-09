package Salary;
import java.util.ArrayList;

class BankAccountSystem {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;


    public BankAccountSystem(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with initial balance: " + initialBalance);
    }

   
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | Current Balance: " + balance);
            System.out.println("Deposit successful. Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | Current Balance: " + balance);
            System.out.println("Withdrawal successful. Current Balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    
    public void displayTransactionHistory() {
        System.out.println("Transaction History for Account: " + accountNumber);
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
        System.out.println("--------------------------------");
    }
}

public class BankAccount{
    public static void main(String[] args) {
       
        BankAccountSystem account1 = new BankAccountSystem("123456", "Anaan", 5000);
        BankAccountSystem account2 = new BankAccountSystem("789012", "Rehmat", 10000);

        account1.deposit(2000);
        account1.withdraw(1000);
        account1.withdraw(7000); 
        account1.checkBalance();
        account1.displayTransactionHistory();
        
        account2.deposit(5000);
        account2.withdraw(3000);
        account2.checkBalance();
        account2.displayTransactionHistory();
    }
}
