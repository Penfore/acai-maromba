package model.Entities;

public class Adicional {
    private String nome;
    private double preco;

    Adicional(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    public Adicional() {
        this.nome = "";
        this.preco = 0;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Valor não válido";
    }

    public void setPreco(double preco) {
        if (preco > 0)
            this.preco = preco;
        else
            this.preco = 200.0;
    }

    // Clear

    public void limparNome() {
        this.nome = "";
    }

    public void limparPreco() {
        this.preco = 0.0;
    }

}
