package sessao13.exemple01.entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    private BusinessAccount() {
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);// chamando o construtor da super classe
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void Loan(double amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }

    @Override //
    public void withdraw(double amount) {
        super.withdraw(amount); // usamos a sobreposição,
        // porém acrescentamos o super, para pegar toda a funcionalidade que já existe e abaixo dele, damos uma nova condição
        balance -= 2.0;
    }

}
