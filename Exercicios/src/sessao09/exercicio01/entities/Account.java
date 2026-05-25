package sessao09.exercicio01.entities;

public class Account {

    private int number;
    private String holder;
    private double balance;


    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, String holder, double initialDepoisit) {
        this.number = number;
        this.holder = holder;
        deposito(initialDepoisit);
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposito(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }

    public String toString() {
     return  "Account"
             + number
             + ", holder:"
             + holder
             + ",balance: $"
             + String.format("%.2f", balance);
    }
}

