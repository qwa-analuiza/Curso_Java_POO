package sessao16.exe02.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate Date;
    private Double totalValue;

   private  List<Installment> instalments = new ArrayList<>();

    public Contract(LocalDate date, Integer number, Double totalValue) {
        this.Date = date;
        this.number = number;
        this.totalValue = totalValue;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        this.Date = date;
    }

    public List<Installment> getInstalments() {
        return instalments;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }


}
