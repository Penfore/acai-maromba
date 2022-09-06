package entity;

public class Produto {

    private String nome;
    private double preco;
    private Adicional adicionais;

    // Getters

    public Adicional getAdicionais() {
        return adicionais;
    }

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
            this.preco = 2000.0;
    }

    public void setAdicionais(Adicional adicionais) {
        if (adicionais != null)
            this.adicionais = adicionais;
    }

    // Construtor

    Produto(String nome, double preco, Adicional adicionais) {
        if (nome != null && !nome.isEmpty())
            this.nome = nome;
        else
            this.nome = "Valor não válido";
        if (preco > 0)
            this.preco = preco;
        else
            this.preco = 200.0;
    }

    Produto() {
        this.nome = "";
        this.preco = 0;
        this.adicionais = new Adicional();
    }

    // Clear

    public void limparNome() {
        this.nome = "";
    }

    public void limparPreco() {
        this.preco = 0.0;
    }

    public void limparAdicional() {
        this.adicionais = null;
    }

}