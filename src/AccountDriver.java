/**
 * Program to test drive the Account class
 * CSC201 Assignment 11.8
 * 10/15/17
 * @author Laura Witherspoon
 */

public class AccountDriver {

    public static void main(String[] args) {
        Account.setAnnualInterestRate(1.5);

        Account account1 = new Account(1122, "George", 1000.00);

        account1.deposit(30.00);
        account1.deposit(40.00);
        account1.deposit(50.00);

        account1.withdraw(5);
        account1.withdraw(4);
        account1.withdraw(2);

        // Display account summary
        System.out.println(account1);
    }
}
