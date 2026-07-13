package sessao14.exe02.entities;

import sessao14.exe02.exceptions.BusinessException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account() {
    }

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getMnumber() {
        return number;
    }

    public void setMnumber(Integer mnumber) {
        this.number = mnumber;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Double deposit(Double amount){
        return  balance += amount ;
    }

    public Double withdraw(Double amount){
        validateWithdraw(amount);
        return  balance -= amount ;
    }

    public void validateWithdraw(double amount){
        if( amount > getBalance() ){
           throw new BusinessException("Withdraw error: Not enough balance") ;
        }
        if (amount > getWithdrawLimit()){
            throw  new BusinessException("The amount exceeds withdraw limit");
        }
    }

}
