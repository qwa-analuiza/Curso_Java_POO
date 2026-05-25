package sessao13.exe02.entities;

public class OutsourcedEmployee extends Empoyee{

    private  Double additionalCharge;

    public OutsourcedEmployee(){}


    public OutsourcedEmployee(Integer hours, String name, Double valuePerours, Double additionalCharge) {
        super(hours, name, valuePerours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment( ){
        return  super.payment() + additionalCharge * 1.1;
    }
}
