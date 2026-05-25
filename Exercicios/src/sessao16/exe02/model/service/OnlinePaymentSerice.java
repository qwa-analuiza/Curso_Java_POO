package sessao16.exe02.model.service;

public interface OnlinePaymentSerice {

    double paymentFree(double amount);
    double interest (double amount, int month);

}
