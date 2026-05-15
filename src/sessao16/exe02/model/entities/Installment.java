package sessao16.exe02.model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {

    private LocalDate date;
    private Double amount;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyy");

    public Installment() {
    }

    public Installment(Double amount, LocalDate date) {
        this.amount = amount;
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDueDate(LocalDate dueDate) {
        this.date = dueDate;
    }

    @Override
    public String toString() {
        return getDate().format(fmt) + " - " + String.format("%.2f", getAmount());
    }
}
