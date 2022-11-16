package model.entities;

public class Adicional {
    private String nome;
    private double preco;
    private int id;

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

    public int getId() {
        return id;
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

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID invalido!");
        }
    }

    // Clear

    public void limparNome() {
        this.nome = "";
    }

    public void limparPreco() {
        this.preco = 0.0;
    }

}
