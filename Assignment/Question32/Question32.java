/*
A bank maintains two kinds of accounts - Savings Account and Current Account.
The savings account provides compound interest, deposit and withdrawal facilities. 
The current account only provides deposit and withdrawal facilities. 
Current account holders should also maintain a minimum balance.
If balance falls below this level, a service charge is imposed.

Create a class Account that stores customer name, account number, and type of account.
From this derive the classes Curr-acct and Sav-acct.

Include the necessary methods in order to achieve the following tasks.
    a. Accept deposit from a customer and update the balance.
    b. Display the balance.
    c. Compute interest and add to balance.
    d. Permit withdrawal and update the balance (Check for the minimum balance, impose penalty if necessary).
*/

class BankAccount {
    private String accountNum;
    private double balance;

    public BankAccount(String acctNum, double initialBalance) { 
        accountNum = acctNum; 
        balance = initialBalance;
    }
    public void deposit(double amount) {
        double newBalance = balance + amount; 
        balance = newBalance;
    }
    public void withdraw(double amount) {
        double newBalance = balance - amount; 
        balance = newBalance;
    }
    public String getAccount() {
        return accountNum;
    }
    public double getBalance() {
        return balance;
    }
    public void transferFundsA(BankAccount destination, double amount) {
        destination.balance = destination.balance + amount;
        this.balance = this.balance - amount;
    }
    public void transferFundsB(BankAccount destination, double amount) {
        destination.deposit(amount);
        this.withdraw(amount);
    }
}

class Question32 { 
    public static void main(String[] args) {
        BankAccount first = new BankAccount("1111111", 20000); 
        BankAccount second = new BankAccount("2222222", 30000); 
        System.out.printf("Account Number : %s has initial balance of $%.2f%n", first.getAccount(), first.getBalance()); 
        System.out.printf("Account Number : %s has initial balance of $%.2f%n", second.getAccount(), second.getBalance());
        
        first.transferFundsA(second, 5000); 
        System.out.println("\nAfter \"first.transferFunds(second, 5000)\" ..."); 
        System.out.printf("Account Number : %s has new balance of $%.2f%n", first.getAccount(), first.getBalance());
        System.out.printf("Account Number : %s has new balance of $%.2f%n", second.getAccount(), second.getBalance());

        second.transferFundsB(first, 10000);
        System.out.println("\nAfter \"second.transferFunds(first, 10000)\" ..."); 
        System.out.printf("Account Number : %s has new balance of $%.2f%n", first.getAccount(), first.getBalance()); 
        System.out.printf("Account Number : %s has new balance of $%.2f%n", second.getAccount(), second.getBalance());
    }
}

/* Output after execution

Account Number : 1111111 has initial balance of $20000.00
Account Number : 2222222 has initial balance of $30000.00

After "first.transferFunds(second, 5000)" ...
Account Number : 1111111 has new balance of $15000.00
Account Number : 2222222 has new balance of $35000.00

After "second.transferFunds(first, 10000)" ...
Account Number : 1111111 has new balance of $25000.00
Account Number : 2222222 has new balance of $25000.00

*/
