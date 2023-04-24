class BankDetails {
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankDetails(String accountHolderName, String accountNumber, String accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void getDetails() {
        // implementation details
    }

    public void printDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + balance);
    }
}

class BankProcess extends BankDetails {
    private double amount;

    public BankProcess(String accountHolderName, String accountNumber, String accountType, double balance) {
        super(accountHolderName, accountNumber, accountType, balance);
        this.amount = 0.0;
    }

    public void deposit(double amount) {
        this.amount = amount;
        balance += amount;
        System.out.println("Deposit Successful. New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            this.amount = amount;
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance. Withdrawal Failed.");
        }
    }
}

public class bankaccount {
    
}
