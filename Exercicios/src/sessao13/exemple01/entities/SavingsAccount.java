package sessao13.exemple01.entities;

public class  SavingsAccount extends  Account{
    private Double interestRate;

    public SavingsAccount (){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void upDateBalance(){
        balance += balance * interestRate;
    }
    @Override // sobreposição: eu peguei um metodo da suerclass e usei ele aqui porém modiiquei ele nessa classe
    public void withdraw(double amount) {
        balance -= amount;

    }

}
