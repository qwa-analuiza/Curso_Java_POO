package sessao16.exe04.entities;

public class UsaInterestService  implements InterestService{
    private final Double interesrRate; //taxa de juros

    public UsaInterestService(Double interesrRate) {
        this.interesrRate = interesrRate;
    }

    public Double getInteresrRate() {
        return interesrRate;
    }

    @Override
    public double getInterestRate() {
        return interesrRate;
    }
}
