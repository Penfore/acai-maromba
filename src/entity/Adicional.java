package entity;

import java.util.ArrayList;
import java.util.List;

public class Adicional {
    private String nome;
    private double preco;
    List<Adicional> listaAdicionais = new ArrayList<>();

    Adicional(String nome, double preco) {
        setNome(nome);
        setPreco(preco);
    }

    Adicional() {
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

    // Temporário, será trocado por um método para buscar na base de dados
    public List<Adicional> buscarAdicionais(String nomeAdicional) {
        List<Adicional> adicionaisFiltrados = new ArrayList<>();

        if (nomeAdicional.isEmpty())
            adicionaisFiltrados.addAll(this.listaAdicionais);
        else {
            for (int i = 0; i < this.listaAdicionais.size(); i++) {
                Adicional adicional = this.listaAdicionais.get(i);
                if (adicional.getNome().startsWith(nomeAdicional))
                    adicionaisFiltrados.add(adicional);
            }
        }

        return adicionaisFiltrados;
    }

}
