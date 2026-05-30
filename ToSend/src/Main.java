class BankAccount {
    protected double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double overdraftLimit = 500;

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
        }
    }
}

class FixedDepositAccount extends BankAccount {
    private boolean isMatured = false;

    public void mature() {
        isMatured = true;
    }

    @Override
    public void withdraw(double amount) {
        if (isMatured && amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class Main {
    public static void processTransaction(BankAccount account, double amount) {
        account.deposit(amount);
        account.withdraw(amount / 2);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new SavingsAccount();
        FixedDepositAccount account3 = new FixedDepositAccount();
        account3.mature();

        processTransaction(account1, 1000);
        processTransaction(account2, 1000);
        processTransaction(account3, 1000);
    }
}