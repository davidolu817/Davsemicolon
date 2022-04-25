package tdd;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if (amount > 0 ) {
            balance = balance + amount;
        }
    }

    public void withdrawal(int withdrawalAmount) {
        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        }
        else {
            balance = balance;
        }
    }

}
