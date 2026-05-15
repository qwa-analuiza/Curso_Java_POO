package sessao16.exe02.model.service;

import sessao16.exe02.model.entities.Contract;
import sessao16.exe02.model.entities.Installment;
import java.time.LocalDate;

public class ContractService {

    private final OnlinePaymentSerice onlinePaymentSerice;

    public ContractService(OnlinePaymentSerice onlinePaymentSerice) {
        this.onlinePaymentSerice = onlinePaymentSerice;
    }

    public void processContract(Contract contract, int month) {
        double basicQuota = contract.getTotalValue() / month;

        for (int i = 1; i <= month; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentSerice.interest(basicQuota,i);
            double fee = onlinePaymentSerice.paymentFree(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Installment(quota, dueDate));
        }
    }
}
