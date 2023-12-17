package access.b;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public method
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }else{
            System.out.println("Amount is not valid");
        }
    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && (balance - amount >= 0 )){
            balance -= amount;
        }else{
            System.out.println("Amount is not valid or balance is not enough to withdraw amount");
        }
    }
    
    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        return amount > 0;
    }

}
