package entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private String nome;
    private double preco;
    private List<Adicional> adicionais;
    private int id;

    // Getters

    public int getId() {
        return this.id;
    }

    public List<Adicional> getAdicionais() {
        return adicionais;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Setters

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        } else {
            System.out.println("ID invalido!");
        }
    }

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

    public void setAdicionais(List<Adicional> adicionais) {
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

    public Produto() {
        this.nome = "";
        this.preco = 0;
        this.adicionais = new ArrayList<Adicional>();
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
