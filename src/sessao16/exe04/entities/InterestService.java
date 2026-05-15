package sessao16.exe04.entities;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();

    default double payment(Double amount, int month) {// implemento um metodo defaut que irá servir para duas classes que implementam a mesma interface;
        if (month < 1) {
            throw new InvalidParameterException("Months must be greater than zero");
        }
        return amount * Math.pow((1 + getInterestRate() / 100), month);
    }
}
