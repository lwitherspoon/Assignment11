import java.util.ArrayList;
import java.util.Date;

/**
 * Definition of Account class that stores bank account information and transactions
 * CSC201 Assignment 11.8
 * 10/15/17
 * @author Laura Witherspoon
 */

public class Account {
    private int id;
    private String name;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;
    private ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    Account() {
        this.id = 0;
        this.balance = 0.0;
        this.dateCreated = new Date();
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate * 100;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate / 100;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Converts annual interest rate into monthly rate
     * @return monthly interest rate
     */
    private double getMonthlyInterestRate() {
        return (Account.annualInterestRate / 12);
    }

    /**
     * Calculate the amount of monthly interest
     * @return the monthly interest gained
     */
    public double getMonthlyInterest() {
        return (this.balance * getMonthlyInterestRate());
    }

    /**
     * Method to withdraw amount from account and track the transaction
     * @param amount the dollar amount to withdraw
     */
    public void withdraw(double amount) {
        this.balance -= amount;
        Transaction withdrawl = new Transaction('-', amount, getBalance(), String.format("Withdrawl of $%.2f", amount));
        transactions.add(0, withdrawl);
    }

    /**
     * Method to deposit amount into account and track the transaction
     * @param amount the dollar amount to deposit
     */
    public void deposit(double amount) {
        this.balance += amount;
        Transaction deposit = new Transaction('+', amount, getBalance(), String.format("Deposit of $%.2f", amount));
        transactions.add(0, deposit);
    }

    /**
     * Method to display account summary
     * @return account summary details
     */
    @Override
    public String toString() {

        String result = String.format("Account Id: %d\nAccount Holder: %s\nAccount Balance: $%.2f\n", id, name, balance);

        return result +
                "Annual Interest Rate: " + getAnnualInterestRate() + "%\n" +
                "Transactions: " + transactions;
    }
}
