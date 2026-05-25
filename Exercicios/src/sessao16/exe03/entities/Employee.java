package sessao16.exe03.entities;

public class Employee implements Comparable<Employee>{

    private String name;
    private Double salay;

    public Employee(String name, Double salay) {
        this.name = name;
        this.salay = salay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalay() {
        return salay;
    }

    public void setSalay(Double salay) {
        this.salay = salay;
    }

    @Override
    public int compareTo(Employee other) {
        return salay.compareTo(other.getSalay());
    }
}



