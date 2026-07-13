package sessao13.exe02.entities;

public class Empoyee {
    private String name;
    protected Integer hours;
    protected Double valuePerHours;

    public Empoyee(){
    }

    public Empoyee(Integer hours, String name, Double valuePerours) {
        this.hours = hours;
        this.name = name;
        this.valuePerHours = valuePerours;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerours() {
        return valuePerHours;
    }

    public void setValuePerours(Double valuePerours) {
        this.valuePerHours = valuePerours;
    }

    public Double payment(){
        return  hours * valuePerHours;
    }
}
