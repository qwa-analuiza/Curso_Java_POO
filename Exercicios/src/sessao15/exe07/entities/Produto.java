package sessao15.exe07.entities;

public class Produto {
    private String nome;
    private Double price;
    private Integer quantity;

    public Produto(String nome, Double price, Integer quantity) {
        this.nome = nome;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double valorTotal(){
       return price * quantity;
    }

}
