package sessao16.exe02.model.service;

public class PaypalService implements OnlinePaymentSerice{

    @Override
    public double paymentFree(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int month) {
        return amount * 0.01* month;
    }
}
