package java_class;

class BankAccount {
     String accountHolder;
    long accountNumber;
    double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be greater than 0.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.accountHolder = "Chhavi Varshney";
        acc1.accountNumber = 1234567890L;
        acc1.balance = 10000.0;

        acc1.displayBalance();

        acc1.deposit(5000);

        acc1.withdraw(3000);

        acc1.withdraw(20000);

        acc1.displayBalance();
    }
}
