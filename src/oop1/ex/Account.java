package oop1.ex;

public class Account {

    private int balance; //잔액

    Account(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            printImpossibleWithdraw();
        }
    }

    public int getBalance() {
        return balance;
    }

    private void printImpossibleWithdraw() {
        System.out.println("balance is lack");
    }
}
