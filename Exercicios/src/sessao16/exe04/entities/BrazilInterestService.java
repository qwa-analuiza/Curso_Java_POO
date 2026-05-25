package sessao16.exe04.entities;
public class BrazilInterestService implements InterestService {
    private final Double interesrRate; //taxa de juros

    public BrazilInterestService(Double interesrRate) {
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
