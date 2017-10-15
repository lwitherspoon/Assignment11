import java.util.Date;

/**
 * Definition of Transaction class that stores data on transactions in an Account
 * CSC201 Assignment 11.8
 * 10/15/17
 * @author Laura Witherspoon
 */

public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private double balance;
    private String description;

    Transaction() {
        this.date = new Date();
        this.amount = 0;
        this.balance = 0;
        this.description = "";
    }

    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("\n\n%tc\n%s\nAccount balance: $%.2f", date, description, balance);
    }
}
