package Hw2;

// Define a custom exception class
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Bank account class
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in account");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        try {
            account.withdraw(1500);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
