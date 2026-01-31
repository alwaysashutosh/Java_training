package day7.oops;

public class Bank_account {

    // Private data members (ENCAPSULATION)
    private int accountNumber;
    private int balance;
    private boolean isActiveLoan;
    private static String BranchName; //common to everyone so  we have changed it

    // Public data member (not recommended, but kept as per your code)
    public String name;

    // Constructor
    public Bank_account(int accountNumber, int balance, String name ,boolean hasActiveLoan) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.isActiveLoan = false; // default
        BranchName="SBI Gangapur Aurangabad";

    }

    // Getter for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Setter for account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //  Getter for balance
    public int getBalance() {
        return balance;
    }

    // Balance should NOT be set directly (business rule)
    // Keeping setter for learning purpose
    public void setBalance(int balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    // deposit method
    public void deposit(int amount) {
        if (amount > 0) {
            balance+=amount;
            System.out.println("Amount deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw method
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (balance - amount < 0) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
    }

    // Loan status methods
    public boolean hasActiveLoan() {
        return isActiveLoan;
    }

    public void applyLoan() {
        isActiveLoan = true;
    }

    public void closeLoan() {
        isActiveLoan = false;
    }

    public static void main(String args[]){
        Bank_account c1=new Bank_account(54321,10000,"Pranav Seth" ,true);
        Bank_account c2=new Bank_account(456123,100010,"RM",false);
        c1.deposit(7000);
        c1.withdraw(4000);
        c2.withdraw(11000);
        c2.checkbalance();




    }

    public static void updateAddress(String Address){

    }

    public void checkbalance() {
        System.out.print("Your_balance is" +balance);
    }
}
