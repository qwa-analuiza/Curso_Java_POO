package sessao10.exe05.entities;

public class Pessoas {
    private String name;
    private int idade;
    private double altura;

    public Pessoas(double altura, String name, int idade) {
        this.altura = altura;
        this.idade = idade;
        this.name = name;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
