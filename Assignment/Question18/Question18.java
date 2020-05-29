/*
Write a program to design a class to represent a bank account. Include the following members.

Data members
- Name of depositor
- Account Number
- Type of account
- Balance account in the account

Methods:- 
- To assign initial values
- To deposit an account
- To withdraw an account after checking balance.
- To display the name and balance
*/

import java.util.Scanner;

class Bank {
    private long Accno;
    private String Name, AcType;
    private double Balance;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name : ");
        Name = scanner.nextLine();
        System.out.print("Enter Account Type : ");
        AcType = scanner.nextLine();
        System.out.print("Enter a Account Number :");
        Accno = scanner.nextLong();
        System.out.print("Enter Balance : ");
        Balance = scanner.nextDouble();
    }

    public void Display() {
        System.out.println("\nAccount Details :");
        System.out.println("Account Holder Name : " + Name);
        System.out.println("Account Number      : " + Accno);
        System.out.println("Account Type        : " + AcType);
        System.out.println("Balance             : " + Balance);
    }

    public void Deposit() {
        Scanner scanner = new Scanner(System.in);
        double Amount;
        do {
            System.out.print("\nEnter Amount to be Deposited : ");
            Amount = scanner.nextDouble();
            if(Amount <= 0) 
                System.out.println("Invalid Amount Entered. Enter again. ");
        } while(Amount <= 0);
        Balance += Amount;
    }

    public void Withdraw() {
        Scanner scanner = new Scanner(System.in);
        double Amount;
        do {
            System.out.print("\nEnter Amount to be Withdrawn : ");
            Amount = scanner.nextDouble();
            if((Balance -Amount ) < 1000) 
                System.out.println("Minimum of Rs. 1000 is to be maintained. Enter again.");
        } while((Balance - Amount ) <= 1000);
        Balance -= Amount;
    }

    public long returnAccNo() {
        return Accno;
    }

    public double getBalance() {
        return Balance;
    }
}

class TestBank {
    private int maxSize;
    private Bank bankArray[];
    private int last;

    public TestBank(int s) {
        maxSize = s;
        bankArray = new Bank[maxSize];
        last = -1;
    }

    public void Insert() {
        if (last == (maxSize - 1)) 
            System.out.println("Cannot enter Bank records.");
        else {
            Bank a = new Bank();
            last += 1;
            a.getDetails();
            bankArray[last] = a;
        }
    }

    public int getSize() {
        return this.maxSize;
    }

    public void displayAllRecords() {
        if (last == -1)
            System.out.println("\n There are no Bank records.");
        else {
            System.out.println("\nBank records : ");
            for (int i = 0; i <= last; i++)
                bankArray[i].Display();
        }
    }

    public int accountExists(long acn) {
        int index = -1;
        for(int i = 0; i <= last; i++)
            if(bankArray[i].returnAccNo() == acn)
                index = i;
        return index;
    }

    public Bank getAccount(int index) {
        return bankArray[index];
    }

    public void updateAccount(int i, Bank B) {
        bankArray[i] = B;
        System.out.println("Available Balance : " + B.getBalance());
    }
}

class Question18 {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        int f = 0, p, menuChoice, sameAccount, differentAccount, i, index;
        Bank B = new Bank();

        System.out.print("Enter total number of Bank Accounts : ");
        int n = scanner.nextInt();
        TestBank Test = new TestBank(n);

        for(i = 0; i < n; i++) {
            System.out.println("\nEnter Details of Account " + (i + 1));
            Test.Insert();
        }

        do {
            System.out.println("\nBanking Operations");
            System.out.print("\nEnter your Account Number : ");
            long acn = scanner.nextLong();
            index = Test.accountExists(acn);
            if (index == -1) {
                System.out.println("\nAccount Number does not exist.");
            } else {
                do {
                    System.out.println("\nBanking Operations :");
                    B = Test.getAccount(index);
                    System.out.println("\n1. Withdraw");
                    System.out.println("2. Deposit");
                    System.out.println("3. Display Account Details");
                    System.out.print("Enter your choice : ");

                    menuChoice = scanner.nextInt();
                    switch(menuChoice) {
                        case 1 : B.Withdraw(); 
                                Test.updateAccount(index, B);
                                B = Test.getAccount(index); 
                                break;
                        case 2 : B.Deposit();
                                Test.updateAccount(index, B);
                                B = Test.getAccount(index);
                                break;
                        case 3 : B.Display();
                                break;
                        default : System.out.println("Invalid Choice.");
                    }
                    System.out.print("\nTo perform another banking operation, press 1.  ");
                    sameAccount = scanner.nextInt();
                } while(sameAccount == 1);
            }
            System.out.print("\nTo perform banking operations on a different accout, press 2.  ");
            differentAccount = scanner.nextInt();
        } while(differentAccount == 2);
    }
}

/* Output after execution

Enter total number of Bank Accounts : 3

Enter Details of Account 1
Enter Name : Kamal
Enter Account Type : Saving 
Enter a Account Number :1000
Enter Balance : 5000 

Enter Details of Account 2
Enter Name : Sharma
Enter Account Type : Saving
Enter a Account Number :1001
Enter Balance : 6000

Enter Details of Account 3
Enter Name : Bharath
Enter Account Type : Current
Enter a Account Number :1002
Enter Balance : 7000

Banking Operations

Enter your Account Number : 1001

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 3

Account Details :
Account Holder Name : Sharma
Account Number      : 1001
Account Type        : Saving
Balance             : 6000.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 1

Enter Amount to be Withdrawn : 200
Available Balance : 5800.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 3

Account Details :
Account Holder Name : Sharma
Account Number      : 1001
Account Type        : Saving
Balance             : 5800.0

To perform another banking operation, press 1.  2

To perform banking operations on a different accout, press 2.  2

Banking Operations

Enter your Account Number : 1000

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 3

Account Details :
Account Holder Name : Kamal
Account Number      : 1000
Account Type        : Saving
Balance             : 5000.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 2

Enter Amount to be Deposited : 2000
Available Balance : 7000.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 3

Account Details :
Account Holder Name : Kamal
Account Number      : 1000
Account Type        : Saving
Balance             : 7000.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 2

Enter Amount to be Deposited : 120
Available Balance : 7120.0

To perform another banking operation, press 1.  1

Banking Operations :

1. Withdraw
2. Deposit
3. Display Account Details
Enter your choice : 4
Invalid Choice.

To perform another banking operation, press 1.  3

To perform banking operations on a different accout, press 2.  4

*/
